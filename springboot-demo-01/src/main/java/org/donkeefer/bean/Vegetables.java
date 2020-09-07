package org.donkeefer.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * lombok @Data注解代替@Getter和@Setter注解
 */
@Data
public class Vegetables {

    private String potato;
    private String eggplant;
    private String greenPepper;

}
