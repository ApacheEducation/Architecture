package org.file.vi.externalizable;

import java.io.*;

/**
 * Externalizable与Serializable的异同
 * 序列化内容
 * Externalizable自定义序列化可以控制序列化的过程和决定哪些属性不被序列化。
 * Serializable序列化时不会调用默认的构造器，而Externalizable序列化时会调用默认构造器的
 * 使用Externalizable时，必须按照写入时的确切顺序读取所有字段状态。否则会产生异常。例如，如果更改ExternalizableDemo类中的number和name属性的读取顺序，则将抛出java.io.EOFException。而Serializable接口没有这个要求
 */

public class Person implements Externalizable {
    private static final long serialVersionUID = 3049593797456980042L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    /**
     * 序列化
     * @param out
     * @throws IOException
     */
    public void writeExternal(ObjectOutput out)
            throws IOException {
        out.writeObject(new StringBuffer(name).reverse());
        out.writeInt(age);
    }

    /**
     * 反序列化
     * @param in
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void readExternal(ObjectInput in)
            throws IOException, ClassNotFoundException {
        this.name = ((StringBuffer) in.readObject()).reverse().toString();
        this.age = in.readInt();
    }
}