
public class MusicStore {

    public void showcase(Instrument instrument) {
        // Showcase Method
        System.out.println(instrument.toString());

        if (instrument instanceof Playable) {
            Playable playable = (Playable) instrument;
            playable.play();
        } else {
            System.out.println("The instrument is not playable");
        }
    }
}

