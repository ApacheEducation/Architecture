package org.homework.firefoxsea.oop;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yanghai
 * @since 2020/8/1 01:25
 */

/**
 * 包括学生，和老师
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -9069207261009286610L;

    private Long id;         //用户ID 学生ID: 3开头 老师ID:2开头

    private String name;     //

    private String userType;  //userType: TEACHER:老师 STUDENT:学生

//    private Long schoolIdentify;   //学校的编码

//    private Long provinceIdentify; //省编码
}
