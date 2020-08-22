package com.onix;

import com.athena.*;
import lombok.Getter;

/**
 * @author yanghai
 * @since 2020/8/23 00:49
 */
public class AthenaServiceClient {

    @Getter
    private final SchoolLoaderImpl schoolLoader;
    @Getter
    private final ProvinceLoaderImpl provinceLoader;
    @Getter
    private final BookLoaderImpl bookLoader;
    @Getter
    private final ClassesLoaderImpl classesLoader;
    @Getter
    private final SubjectLoaderImpl subjectLoader;
    @Getter
    private final UserLoaderImpl userLoader;
    @Getter
    private final UserRefLoaderImpl userRefLoader;


    private AthenaServiceClient() {
        schoolLoader = new SchoolLoaderImpl();
        provinceLoader = new ProvinceLoaderImpl();
        bookLoader = new BookLoaderImpl();
        classesLoader = new ClassesLoaderImpl();
        subjectLoader = new SubjectLoaderImpl();
        userLoader = new UserLoaderImpl();
        userRefLoader = new UserRefLoaderImpl();
    }

    private static final AthenaServiceClient athenaServiceClient = new AthenaServiceClient();

    public static AthenaServiceClient getInstance() {
        return athenaServiceClient;
    }

}
