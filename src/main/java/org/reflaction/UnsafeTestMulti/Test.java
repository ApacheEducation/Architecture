package org.reflaction.UnsafeTestMulti;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by yanghai on 16-8-16.
 */
public class Test {
    public static Unsafe getUnsafe() throws NoSuchFieldException, IllegalAccessException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);
        return unsafe;

    }

    private static long normalize(int value) {
        if(value >= 0) return value;
        return (~0L >>> 32) & value;
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        long intClassAddress = normalize(getUnsafe().getInt(new Integer(1),8L));
        System.out.println(intClassAddress);
        long strClassAddress = normalize(getUnsafe().getInt("", 8L));
        System.out.println(strClassAddress);
        getUnsafe().putAddress(intClassAddress+100 , strClassAddress);
        System.out.println((String) (Object) (new Integer(666)));
    }
}
