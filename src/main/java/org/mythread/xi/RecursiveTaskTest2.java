package org.mythread.xi;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by yanghai on 16-5-14.
 */
public class RecursiveTaskTest2 {
    public static void main(String[] args) throws Exception {
        Path p = Paths.get("/opt/test");
        Path p1 = Paths.get("/opt/test1");
        List<Path> roots = new ArrayList<>();
        roots.add(p);
        roots.add(p1);
        List<Path> result = new ArrayList<>();
        List<MyTask> tasks = new ArrayList<>();
        ForkJoinPool pool = new ForkJoinPool();
        for(Path root:roots) {
            MyTask t = new MyTask(root, "txt");
            pool.execute(t);
            tasks.add(t);
        }

        System.out.print("正在处理中");
        while(isAllDone(tasks) == false) {
            System.out.print(". ");
            TimeUnit.SECONDS.sleep(1);
        }

        for(MyTask t:tasks) {
            result.addAll(t.get());
        }

        for(Path pp:result) {
            System.out.println(pp);
        }
    }

    private static boolean isAllDone(List<MyTask> tasks) {
        boolean result = true;
        for(MyTask t:tasks) {
            if(t.isDone() == false) {
                result = false;
                break;
            }
        }
        return result;
    }
}

class MyTask extends RecursiveTask<List<Path>> {

    private static final long serialVersionUID = 1L;

    private Path path;
    private String fileExtention;

    public MyTask(Path path, String fileExtention) {
        super();
        this.path = path;
        this.fileExtention = fileExtention;
    }

    @Override
    protected List<Path> compute() {
        List<Path> result = new ArrayList<>();
        try {
            DirectoryStream<Path> paths = Files.newDirectoryStream(path);
            List<MyTask> subTasks = new ArrayList<>();
            for(Path p:paths) {
                if(Files.isDirectory(p)) {
                    MyTask t = new MyTask(p, fileExtention);
                    t.fork();
                    subTasks.add(t);
                }else if(Files.isRegularFile(p)) {
                    if(p.toString().toLowerCase().endsWith("."+fileExtention)) {
                        result.add(p);
                    }
                }
            }

            for(MyTask t:subTasks) {
                result.addAll(t.join());
            }
        } catch (IOException e) {
        }
        return result;
    }
}
