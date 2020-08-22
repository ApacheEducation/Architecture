package com.athena.api;

import com.athena.entity.Province;

import java.util.List;

/**
 * @author yanghai
 * @since 2020/8/23 00:45
 */
public interface IProvinceLoader {

    Province getProvinceByProvinceId(Long provinceId);

    List<Province> getProvincesByName(String name);
}
