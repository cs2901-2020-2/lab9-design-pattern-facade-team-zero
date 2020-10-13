package facade;

import java.util.logging.Logger;

class HomeTheaterFacade {

    static final Logger logger = Logger.getLogger(HomeTheaterFacade.class.getName());

    Amplifier amp;
    DVDPlayer dvd;
    CDPlayer cd;
    Projector projector;
    Screen screen;
    TheaterLights lights;
    PopcornPopper popcorn;

    public HomeTheaterFacade() {
        amp = new Amplifier();
        dvd = new DVDPlayer();
        cd = new CDPlayer();
        projector = new Projector();
        screen = new Screen();
        lights = new TheaterLights();
        popcorn = new PopcornPopper();
    }
    public HomeTheaterFacade(Amplifier amp, DVDPlayer dvd, CDPlayer cd, Projector projector, Screen screen, TheaterLights lights, PopcornPopper popcorn){
        this.amp = amp;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popcorn = popcorn;
    }

    void PlayMovie(String title){
        popcorn.On();
        popcorn.Pop();
        screen.Down();
        projector.On();
        dvd.On();
        amp.On();
        amp.SetSource(dvd);
        amp.SetVolume(65);
        lights.Dim();
        logger.info("Now playing %s" + title);
    }

    void EndMovie(){
        logger.info("The movie has ended. Turning off all electronics.");
        lights.On();
        amp.Off();
        dvd.Off();
        projector.Off();
        screen.Up();
        popcorn.Off();
    }
}