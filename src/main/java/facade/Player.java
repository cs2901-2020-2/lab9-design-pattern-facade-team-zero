package facade;

public interface Player{
    boolean turned = false;
    boolean stop = false;
    boolean ejec = false;
    public void On();
    public void Off();
    public void stop();
    public void ejec();


}