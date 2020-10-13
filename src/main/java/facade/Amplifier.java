package facade;
import java.util.logging.Logger;

class Amplifier {
    Amplifier(){}

    static final Logger logger = Logger.getLogger(Amplifier.class.getName());

    public void On(){
        logger.info("Amplifier on.");
    }

    public void Off(){
        logger.info("Amplifier off.");
    }

    public void SetSource(Player player){
        logger.info("Source selected.");
    }

    public void SetVolume(int level){
        logger.info("Volume set at %d%.", level);
    }
}