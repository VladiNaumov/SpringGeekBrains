package com.camera.spring.simple;

import org.springframework.stereotype.Component;

@Component
public class AdvBeanInterfaceImpl implements IBeanInterface {
    public void doSomething() {
        System.out.println(2);
    }
}
