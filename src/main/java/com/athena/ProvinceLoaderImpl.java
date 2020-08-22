package com.athena;

import com.athena.api.IProvinceLoader;
import com.athena.entity.Province;
import com.onix.AthenaDb;
import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author yanghai
 * @since 2020/8/23 01:06
 */
public class ProvinceLoaderImpl implements IProvinceLoader {

    @Override
    public Province getProvinceByProvinceId(Long provinceId) {
        if (null == provinceId) {
            return null;
        }
        return AthenaDb.DB_PROVINCES.stream().filter(it -> Objects.equals(it.getId(), provinceId)).findFirst().orElse(null);
    }

    @Override
    public List<Province> getProvincesByName(String name) {
        if (StringUtils.isBlank(name)) {
            return Collections.emptyList();
        }
        return AthenaDb.DB_PROVINCES.stream().filter(it -> it.getName().contains(name)).collect(Collectors.toList());
    }
}
