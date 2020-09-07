package org.donkeefer.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Person {

    private String id;
    private String name;
    private String[] hobbies;

}
