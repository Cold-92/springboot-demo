package org.donkeefer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 使用非application.properties中配置的常量必须三个注解一起使用
 * 如果只使用application.properties配置的常量只需要用@ConfigurationProperties(prefix = "")即可
 */
@Configuration
@ConfigurationProperties(prefix = "vegetables")
@PropertySource("classpath:vegetables.properties")
public class VegetablesConfig {

    private String potato;
    private String eggplant;
    private String greenPepper;

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }

    public String getGreenPepper() {
        return greenPepper;
    }

    public void setGreenPepper(String greenPepper) {
        this.greenPepper = greenPepper;
    }
}
