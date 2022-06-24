package com.camera.spring.camera;

public class CameraClient {

    public static void main(String[] args) {

        /* данный код рабочий ! */


        Camera camera = new Camera();
        ICameraRoll ColorCameraRoll = new ColorCameraRoll();


        camera.setICameraRoll(ColorCameraRoll);
        camera.doPhotograph();




    }
}
