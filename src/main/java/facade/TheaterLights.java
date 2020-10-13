package facade;

import java.util.logging.Logger;

public class TheaterLights(){
boolean lightTurnOn;
int porcentage;

static final Logger logger = Logger.getLogger(TheaterLights.class.getName());

    public TheaterLights(){
        lightTurnOn = false;
        porcentage = 0;
    }

    public TheaterLights(boolean lightTurnOn){
            this.lightTurnOn = lightTurnOn;
            porcentage = 0;
    }

    public void setPorcetange(int porcentage){
        if (lightTurnOn){
            this.porcentage = porcentage;
        }
    }

    public void lights(){
        if (lightTurnOn){
        logger.info("lights on " + Integer.toString(porcentage) " %");
        }else{
        logger.info("lights off");
        }
    }

}