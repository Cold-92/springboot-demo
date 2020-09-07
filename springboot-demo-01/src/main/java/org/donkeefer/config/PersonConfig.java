package org.donkeefer.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ConfigurationProperties(prefix)
 * 该注解声明这是一个配置文件对应的类
 * prefix是需要配置常量的一级目录
 */
@ConfigurationProperties(prefix = "person")
@Data
public class PersonConfig {

    private String id;
    private String name;
    private String[] hobbies;
}
