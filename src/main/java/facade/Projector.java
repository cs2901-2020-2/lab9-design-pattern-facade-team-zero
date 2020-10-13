package facade;
import java.util.logging.Logger;
public class Projector implements Item {
    static final Logger logger = Logger.getLogger(Projector.class.getName());

    public void On() {
        logger.info("Project on");
    }

    public void Off() {
        logger.info("Project off");
    }
}