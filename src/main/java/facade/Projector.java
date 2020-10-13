package facade;

public class Projector {
    static final Logger logger = Logger.getLogger(Projector.class.getName());

    public void On() {
        logger.info("Project on");
    }

    public void Off() {
        logger.info("Project off");
    }
}