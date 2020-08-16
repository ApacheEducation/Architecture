package org.file.vi.resolve;

import java.io.*;

public class Orientation implements Serializable {
    public static final Orientation HORIZONTAL = new Orientation(1);
    public static final Orientation VERTICAL = new Orientation(2);
    private static final long serialVersionUID = 9177902862897669062L;
    private int value;

    private Orientation(int value) {
        this.value = value;
    }

    private Object readResolve() throws ObjectStreamException {
        if (value == 1) {
            return HORIZONTAL;
        }
        if (value == 2) {
            return VERTICAL;
        }
        return null;
    }
}
