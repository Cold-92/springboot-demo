package org.donkeefer;

import org.donkeefer.config.PersonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @EnableConfigurationProperties({ConfigClass})
 * 告诉主程序自动引入配置文件，配置文件对应的类作为参数
 */
@SpringBootApplication
@EnableConfigurationProperties({PersonConfig.class})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
