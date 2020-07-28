package org.architecture.oop.oopextends;

/**
 * @author yanghai
 * @since 2020/7/26 20:52
 */
public abstract class Author implements IAuthorMethod{

    public String name;

    public String age;

    public String alias;

    public void pubBook() {
        System.out.println("i have pub a book");
    }

    /**
     * 抽象方法
     */
    public abstract void subBook();
}
