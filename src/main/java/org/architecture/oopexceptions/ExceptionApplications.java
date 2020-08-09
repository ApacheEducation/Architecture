package org.architecture.oopexceptions;

import org.architecture.oopexceptions.owner.MyException;

/**
 * @author yanghai
 * @since 2020/8/9 19:08
 */
public class ExceptionApplications {

    public static void main(String[] args) {

        ExceptionApplications exceptionApplications = new ExceptionApplications();
        try {
            int result = exceptionApplications.diveVersionOwner(0, 0);
            System.out.println(result);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("main sucess");
    }


    //异常抛出来
    public int divVersionThrow(int a, int b) throws Exception {
        if (b == 0) {
            throw new ArithmeticException("除数为零,数学老师教过了，不能为零");
        }
        return a / b;
    }

    //异常自己处理
    public int divVersionTryCatch(int a, int b) {
        try {
            return a / b;  // 1 除以 0
        } catch (Exception exception) {
            // do nothings
        }
        return 0;
    }

    public int diveVersionOwner(int a, int b) throws MyException {
        if (a == 0) {
            throw new MyException("我就是不让执行，因为你等于零");
        }
        return 0;
    }
}
