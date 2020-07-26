package org.language;

/**
 * Created by yanghai on 16-4-24.
 */
public class Test11 {
    private static Test11 ourInstance = new Test11();

    public static Test11 getInstance() {
        return ourInstance;
    }

    private Test11() {
    }
}
