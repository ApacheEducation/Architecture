package org.architecture.oopexceptions.owner;

/**
 * @author yanghai
 * @since 2020/8/9 19:09
 */
public class MyException extends Exception {

    private static final long serialVersionUID = 8606345789777823857L;

    public MyException(String message) {
        super(message);
    }

    public MyException() { super(); }
}
