package org.donkeefer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ConfigurationProperties(prefix)
 * 该注解声明这是一个配置文件对应的类
 * prefix是需要配置常量的一级目录
 */
@ConfigurationProperties(prefix = "person")
public class PersonConfig {

    private String id;
    private String name;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
