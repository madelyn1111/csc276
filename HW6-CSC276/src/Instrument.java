
public class Instrument {
    String name;

    // Constructor
    public Instrument(String name) {
        this.name = name;
    }

    // Default Constructor
    public Instrument() {
        name = " ";
    }

    // Overridden toString method
    @Override
    public String toString(){
        return "Instrument: " + name;
    }

    // Setters and Getters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
