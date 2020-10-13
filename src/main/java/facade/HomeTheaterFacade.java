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

    HomeTheaterFacade(){
        amp = new Amplifier();
        dvd = new DVDPlayer();
        cd = new CDPlayer();
        projector = new Projector();
        screen = new Screen();
        lights = TheaterLights();
        popcorn = PopcornPopper();
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
        logger.info("Now playing %s", title);
    }

    void EndMovie(){
        logger.info("The movie has ended. Turning off all electronics.")
        lights.On();
        amp.Off();
        dvd.Off();
        projector.Off();
        screen.Up();
        popcorn.Off();
    }
}