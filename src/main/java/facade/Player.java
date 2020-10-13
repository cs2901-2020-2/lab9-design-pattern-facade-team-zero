package facade;
import java.util.logging.Logger;

public class Player{
    static final Logger logger = Logger.getLogger(Player.class.getName());
    protected boolean turned;
    protected boolean execution;

    public Player(){
        turned = false;
        execution = false;
    }

    public void turnOn(){
        this.turned = true;
    }
    public void turnOff(){
        this.turned = false;
    }
    public void stop(){
        this.execution = true;
    }
    public void ejec(){
        this.execution = false;
    }
}