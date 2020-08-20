package org.architecture.oopexceptions;

/**
 * @author yanghai
 * @since 2020/8/9 19:18
 */
public class SimpleExceptionApplication {

    public static void main(String[] args) {
        SimpleExceptionApplication simpleExceptionApplication = new SimpleExceptionApplication();
//
//        String[] texts = new String[10];
//        for (int i = 0; i < texts.length; i++) {
//            texts[i] = i + "";
//        }

        //throws  抛出去
        //try -- catch finally 自己有能力处理

//        try {
//            // 可能会出现异常的代码
//        } catch (Exception e) {
//            // 出现异常了之后你要做什么
//        } finally {
//            //最终一定要执行
//        }

//        simpleExceptionApplication.end();  //main function success

        String s1 = null;
        String s2 = new String("aaa");
        System.out.println(s1.equals(s2));

    }


    public void forEach(String[] array) throws Exception {
        for (int i = 0; i <= array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public void end() {
        System.out.println("main function success");
    }

    public void cout(String param) {
        System.out.println(param.equals("aa"));
    }

    /**
     1. 获取用户输入用户名，密码
     //code
     2. 校验用户的用户名和密码是否正确  第二步出现，导致程序直接崩溃
     //code
     3. 提示用户登陆成功
     //code
     */

    // UML
}
