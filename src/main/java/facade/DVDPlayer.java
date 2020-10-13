package facade;

import java.util.logging.Logger;

public class DVDPlayer extends Player  {

    static final Logger logger = Logger.getLogger(DVDPlayer.class.getName());


    public DVDPlayer(){
        turned = false;
        stop = false;
        ejec = false;
    }

    public void On(){
        logger.info("turned on");
        this.turned = true;
    }
    public void Off(){
        logger.info("turned off");
        this.turned = false;
    }
    public void stop(){
        logger.info("stopped");
        this.stop = true;
    }
    public void ejec(){
        logger.info("ejected");
        this.ejec = false;
    }

}