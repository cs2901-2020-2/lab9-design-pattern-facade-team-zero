package facade;

public class Screen {
    static final Logger logger = Logger.getLogger(Screen.class.getName());

    public void Down() {
        logger.info("Screen down");
    }

    public void Up() {
        logger.info("Screen up");
    }
}