package com.camera.spring.cameraSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cameraSpring")
public class AppConfig {

    //@Bean(name="camera")
    public ColorCameraRoll colorCameraRoll(){
        return new ColorCameraRoll();
    }

    //@Bean(name="camera")
    public ICamera camera(ICameraRoll iCameraRoll){
        ICamera camera = new CameraImp();
        camera.setCameraRoll(iCameraRoll);
        return camera;
    }


}
