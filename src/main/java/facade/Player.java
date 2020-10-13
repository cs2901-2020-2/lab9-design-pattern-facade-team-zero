package facade;
import java.util.logging.Logger;

public class Player{
    static final Logger logger = Logger.getLogger(Player.class.getName());
    protected boolean turned;
    protected boolean stop;
    protected boolean ejec;
    

    public Player(){
        turned = false;
        execution = false;
    }

    public void turnOn(){
        logger.info("turned on");
        this.turned = true;
    }
    public void turnOff(){
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