package org.socket.iv;

import sun.misc.IOUtils;

import java.io.*;
import java.net.*;
import java.util.*;

public class DefaultProxySelectorTest {

//    public static void main(String[] args) {
//        Properties prop = System.getProperties();
//        // 设置http访问要使用的代理服务器的地址
//        prop.setProperty("http.proxyHost", "192.168.0.254");
//        // 设置http访问要使用的代理服务器的端口
//        prop.setProperty("http.proxyPort", "8080");
//        // 设置不需要通过代理服务器访问的主机，可以使用*通配符，多个地址用|分隔
//        prop.setProperty("http.nonProxyHosts", "localhost|192.168.0.*");
//        // 设置安全访问使用的代理服务器地址与端口
//        // 它没有https.nonProxyHosts属性，它按照http.nonProxyHosts 中设置的规则访问
//        prop.setProperty("https.proxyHost", "192.168.0.254");
//        prop.setProperty("https.proxyPort", "443");
//        // 使用ftp代理服务器的主机、端口以及不需要使用ftp代理服务器的主机
//        prop.setProperty("ftp.proxyHost", "192.168.0.254");
//        prop.setProperty("ftp.proxyPort", "2121");
//        prop.setProperty("ftp.nonProxyHosts", "localhost|192.168.0.*");
//        // socks代理服务器的地址与端口
//        prop.setProperty("socksProxyHost", "192.168.0.254");
//        prop.setProperty("socksProxyPort", "8000");
//        // 设置登陆到代理服务器的用户名和密码
//        Authenticator.setDefault(new MyAuthenticator("userName", "Password"));
//    }
//    static class MyAuthenticator extends Authenticator {
//        private String user = "";
//        private String password = "";
//        public MyAuthenticator(String user, String password) {
//            this.user = user;
//            this.password = password;
//        }
//        protected PasswordAuthentication getPasswordAuthentication() {
//            return new PasswordAuthentication(user, password.toCharArray());
//        }
//    }
    //使用Proxy来对每个连接实现代理
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.baidu.com");
            // 创建代理服务器
            InetSocketAddress addr = new InetSocketAddress("192.168.0.254",
                    8080);
            // Proxy proxy = new Proxy(Proxy.Type.SOCKS, addr); // Socket 代理
            Proxy proxy = new Proxy(Proxy.Type.HTTP, addr); // http 代理
            // 如果我们知道代理server的名字, 可以直接使用
            // 结束
            URLConnection conn = url.openConnection(proxy);
            Scanner scan = new Scanner(conn.getInputStream(), "utf-8");
            PrintStream ps = new PrintStream("index.htm");
                while (scan.hasNextLine()) {
                    String line = scan.nextLine();
                    // 在控制台输出网页资源内容
                    System.out.println(line);
                    // 将网页资源内容输出到指定输出流
                    ps.println(line);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
