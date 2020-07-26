package org.reflaction.iv;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by yanghai on 16-5-10.
 */
class SuperArray {
    private final static int BYTE = 1;
    private long size;
    private long address;
    private static Unsafe unsafe;

    static {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            unsafe = (Unsafe) field.get(null);
        } catch (Exception e) {
            System.out.println("Get Unsafe instance occur error" + e);
        }
    }

    public SuperArray(long size) {
        this.size = size;
        //得到分配内存的起始地址
        address = unsafe.allocateMemory(size * BYTE);
    }
    public void set(long i, byte value) {
        unsafe.putByte(address + i * BYTE, value);
    }
    public int get(long idx) {
        return unsafe.getByte(address + idx * BYTE);
    }
    public long size() {
        return size;
    }

    public static void main(String[] args) {
        long SUPER_SIZE = (long)Integer.MAX_VALUE * 2;
        SuperArray array = new SuperArray(SUPER_SIZE);
        int sum=0;
        System.out.println("Array size:" + array.size()); // 4294967294
        for (int i = 0; i < 100; i++) {
            array.set((long)Integer.MAX_VALUE + i, (byte)3);
            sum += array.get((long)Integer.MAX_VALUE + i);
        }
        System.out.println("Sum of 100 elements:" + sum);  // 300
    }
}
