package org.donkeefer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试RestController注解代替Controller+ResponseBody注解
 */
@RestController
public class JsonController {

    /**
     * @return 只要Controller类使用RestController注解，返回的String
     * 全都是Json形式，不用写ResponseBody注解了
     */
    @RequestMapping("/json")
    public String json() {
        return "json";
    }

}
