
public class Main {
    public static void main(String[] args) {
        // New instance of music store
        MusicStore musicStore = new MusicStore();

        // Array of instrument objects
        Instrument[] instruments = {
                new Guitar("Guitar"),
                new Piano("Piano"),
                new Drums("Drums"),
                new Instrument("Violin"),
        };

        // Loop through instruments and calls showcase method
        for (Instrument instrument : instruments) {
            musicStore.showcase(instrument);
        }
    }
}