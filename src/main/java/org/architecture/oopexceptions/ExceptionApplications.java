package org.architecture.oopexceptions;

import org.architecture.oopexceptions.owner.MyException;

/**
 * @author yanghai
 * @since 2020/8/9 19:08
 */
public class ExceptionApplications {

    public static void main(String[] args) {

        try {
            divVersionThrow(0, 0);
        } catch (MyException exception) {
            System.out.println(exception.getMessage());
        } finally {

        }
    }


    //异常抛出来
    public static int divVersionThrow(int a, int b) throws MyException {
        if (b < 0) {
            throw new MyException("");
        }
        return a / b;
    }

    //异常自己处理
    public int divVersionTryCatch(int a, int b) {
        if (b < 0) {
            try {
                return 0;
            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println(exception.getMessage());
            } finally {

                return 0;
            }
        }
        return a / b;
    }
}
