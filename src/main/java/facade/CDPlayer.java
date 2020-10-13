package facade;
import java.util.logging.Logger;

public class CDPlayer extends Player{
    private static CDPlayer instance;
    private CDPlayer(){
        turned = false;
        execution = false;
    }



}