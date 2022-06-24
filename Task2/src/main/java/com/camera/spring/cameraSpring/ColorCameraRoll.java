package com.camera.spring.cameraSpring;


import org.springframework.stereotype.Component;

@Component ("cameraRoll")
public class ColorCameraRoll implements ICameraRoll {
    @Override
    public void processing() {
        System.out.println("-1 цветной кадр");
    }
}
