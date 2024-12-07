
public class Guitar extends Instrument implements Playable{

    // Constructor
    public Guitar(String name){
        super(name);
    }

    // Default Constructor
    public Guitar() {
        super();
    }

    // Play method from playable
    @Override
    public void play(){
        System.out.println("Strumming the Guitar");
    }
}
