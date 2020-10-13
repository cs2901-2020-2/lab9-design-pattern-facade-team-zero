package facade;

import java.util.logging.Logger;

public class PopcornPopper(){
    boolean popper;
    boolean makePopcorn;

    static final Logger logger = Logger.getLogger(PopcornPopper.class.getName());

    public PopcornPopper(){
        popper = false;
        makePopcorn = false;
    }

    public void turnOnPopper(){
        popper = true;
    }

    public void makePopcorn(){
        if (popper){
            makePopcorn = true;
        }
    }

    public void popperr(){
        if (popper){
            if (makePopcorn){
                logger.info("popper turn on and making popcorn");
            }
            logger.info("popper turn on");
        }else{
            logger.info("popper turn off");
        }
    }
}