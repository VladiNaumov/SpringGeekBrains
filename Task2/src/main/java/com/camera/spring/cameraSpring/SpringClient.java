package com.camera.spring.cameraSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringClient {

    public static void main(String[] args) {


        ApplicationContext context_  =  new AnnotationConfigApplicationContext( AppConfig.class );
        ICamera camera_  =  context_.getBean ( "camera" , ICamera.class );
        camera_ . doPhotograph ();



        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Получает фотоаппарат
        ICamera camera = context.getBean( "camera" , ICamera.class);

        // Ломает фотоаппарат
        camera.breaking();
        // Пытается сделать фото. Неудача!
        camera.doPhotograph();

        // Просит еще один фотоаппарат
        camera = context.getBean( "camera" , ICamera.class);

        // Пытается сделать фото
        camera.doPhotograph();
    }

}
