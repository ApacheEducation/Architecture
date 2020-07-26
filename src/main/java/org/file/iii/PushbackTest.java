package org.file.iii;

import java.io.*;

public class PushbackTest {
    public static void main(String[] args) {
        try {
            //指定推回缓冲区的长度为64
            PushbackReader pr = new PushbackReader(new FileReader(
                    "PushbackTest.java"), 64);

            char[] buf = new char[32];
            String lastContent = "";
            int hasRead = 0;
            while ((hasRead = pr.read(buf)) > 0) {
                String content = new String(buf, 0, hasRead);
                int targetIndex = 0;
                if ((targetIndex = (lastContent + content)
                        .indexOf("new PushbackReader")) > 0) {
                    pr.unread((lastContent + content).toCharArray());
                    if (targetIndex > 32) {
                        buf = new char[targetIndex];
                    }
                    pr.read(buf, 0, targetIndex);
                    System.out.print(new String(buf, 0, targetIndex));
                    System.exit(0);
                } else {
                    System.out.print(lastContent);
                    lastContent = content;
                }
            }
            pr.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

