package com.camera.spring.cameraSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("camera")
@Scope( "prototype" )
public class CameraImp implements ICamera {

    @Autowired
    @Qualifier( "cameraRoll" )
    private ICameraRoll iCameraRoll;

    @Value( "false" )
    private   boolean  broken;

    @Override
    public ICameraRoll getCameraRoll() {
        return  iCameraRoll;
    }

    @Override
    public void setCameraRoll(ICameraRoll iCameraRoll) {
        this .iCameraRoll = iCameraRoll;
    }

    @Override
    public void breaking() {
        this.broken= true ;
    }

    @Override
    public boolean isBroken() {
        return  broken;
    }

    @Override
    public void doPhotograph() {
        if  (isBroken()) {
            System.out.println( "Фотоаппарат сломан!" );
            return ;
        }
        System.out.println( "Сделана фотография!" );
        iCameraRoll.processing();
    }




}