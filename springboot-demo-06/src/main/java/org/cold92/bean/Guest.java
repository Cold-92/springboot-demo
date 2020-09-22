package org.cold92.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Guest {

    private String name;
    private int age;
    private String sex;

}
