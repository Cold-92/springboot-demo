package org.donkeefer.controller;

import org.donkeefer.bean.Person;
import org.donkeefer.config.PersonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试application配置常量，及其中文乱码
 */
@RestController
public class PersonController {

    // 使用配置文件静态配置常量
//    @Value("${person.id}")
//    private String id;
//    @Value("${person.name}")
//    private String name;

    // 使用配置类动态配置常量
    @Autowired
    private PersonConfig personConfig;

    @RequestMapping("/person")
    public Person person() {
        Person person = new Person();
        // 使用配置文件静态配置常量
//        person.setId(id);
//        person.setName(name);

        // 使用配置类动态配置常量
        person.setId(personConfig.getId());
        person.setName(personConfig.getName());
        return person;
    }
}
