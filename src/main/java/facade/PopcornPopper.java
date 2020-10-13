package facade;

import java.util.logging.Logger;

public class PopcornPopper implements Item{
    boolean popper;
    boolean makePopcorn;

    static final Logger logger = Logger.getLogger(PopcornPopper.class.getName());

    public PopcornPopper(){
        popper = false;
        makePopcorn = false;
    }

    public void On(){
        popper = true;
    }

    public void Off(){
        popper = true;
    }

    public void Pop(){
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