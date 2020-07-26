package org.jvmti;

import java.io.IOException;
import com.sun.tools.attach.VirtualMachine;

/**
 * Created by yanghai on 18-10-25.
 */
public class TestAgentVMAttacher {
    public static void main(String[] args) throws Exception {
        String pid = "32142"; // 12345改成你想attach的java进程id
        String agentPath = "/disk/test/iotest/src/libJVMTI.so"; // path_to_agent为你编译的agent的路径
        VirtualMachine virtualMachine = VirtualMachine.attach(pid);
        virtualMachine.loadAgentPath(agentPath, null);//第二个参数为传递给agent的参数
        virtualMachine.detach();
    }
}
