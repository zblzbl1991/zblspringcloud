package com.springcloud.feign;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private SchedualServiceHi feignService;
    @RequestMapping("/hi")
    public String sayHI(@RequestParam("name")String name){
        return feignService.sayHiFromClientOne(name);
    }


}
