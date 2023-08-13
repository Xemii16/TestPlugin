package com.yecraft.testplugin;

import com.yecraft.configuration.Configuration;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MainConfiguration extends Configuration {
    public MainConfiguration(String version, File file) {
        super(version, file);
    }

    @Override
    public Map<String, Object> defaults() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("redis", false);
        return map;
    }

    @Override
    public Map<String, List<String>> defaultComments() {
        Map<String, List<String>> map = new LinkedHashMap<>();
        map.put("redis", List.of("Whether to enable the database", "True - include, false - do not include"));
        return map;
    }
}
