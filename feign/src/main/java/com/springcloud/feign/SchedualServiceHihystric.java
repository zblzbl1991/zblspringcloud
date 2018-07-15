package com.springcloud.feign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHihystric implements  SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,"+name;
    }
}
