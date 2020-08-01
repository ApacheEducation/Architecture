package org.homework.firefoxsea.oop;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yanghai
 * @since 2020/8/1 01:25
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -9069207261009286610L;

    private Long id;

    private String name;

    private String userType;

    private Long classIdentify;

    private Long schoolIdentify;
}
