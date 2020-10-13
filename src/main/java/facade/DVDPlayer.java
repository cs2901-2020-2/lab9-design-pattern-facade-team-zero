package facade;

public class DVDPlayer implements Player{
    public DVDPlayer{
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