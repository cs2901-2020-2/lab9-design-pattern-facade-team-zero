package facade;

public abstract class Player implements Item{
    protected boolean turned;
    protected boolean stop;
    protected boolean ejec;

    public abstract void On();
    public abstract void Off();
    public abstract void stop();
    public abstract void ejec();

}
