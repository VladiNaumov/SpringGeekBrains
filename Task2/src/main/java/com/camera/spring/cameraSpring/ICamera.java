package com.camera.spring.cameraSpring;

public interface ICamera {

    ICameraRoll getCameraRoll();

    void setCameraRoll(ICameraRoll iCameraRoll);

    void doPhotograph();

    void breaking();

    boolean isBroken();
}