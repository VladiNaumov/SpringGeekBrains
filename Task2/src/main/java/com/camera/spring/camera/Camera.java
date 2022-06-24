package com.camera.spring.camera;

public class Camera {


    private ICameraRoll iCameraRoll;


    public void setICameraRoll(ICameraRoll iCameraRoll) {
        this.iCameraRoll = iCameraRoll;
    }


    public ICameraRoll getICameraRoll(){
        return iCameraRoll;
    }


    public void doPhotograph(){
        System.out.println("Шёлк!");
        iCameraRoll.processing();
    }
}
