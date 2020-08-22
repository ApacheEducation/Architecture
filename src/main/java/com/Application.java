package com;

import com.onix.AthenaServiceClient;
import com.athena.entity.*;

import java.util.List;

/**
 * @author yanghai
 * @since 2020/8/23 00:47
 */
public class Application {

    public static void main(String[] args) {

    }


    public static List<School> executeQueryProvinceSchoolByProvinceId(Long provinceId) {
        return AthenaServiceClient.getInstance().getSchoolLoader().getSchoolByProvinceId(provinceId);
    }

    public static void executeQuerySchoolBySchoolId(Long schoolId) {
        School school = AthenaServiceClient.getInstance().getSchoolLoader().getSchoolById(schoolId);
        if (null != school) {
            Long provinceId = school.getProvinceId();
            Province province = AthenaServiceClient.getInstance().getProvinceLoader().getProvinceByProvinceId(provinceId);
            if (null == province) {
                System.out.println("School ->" + school.toString() + "province ->" + province.toString());
            }
        }
    }

}
