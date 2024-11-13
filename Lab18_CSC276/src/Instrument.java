
public abstract class Instrument {
    protected String name;

    // Default constructor
    public Instrument(){
        name = "n/a";
    }

    // Constructor
    public Instrument(String name){
        this.name = name;
    }

    // Play method to be overridden
    public abstract void play(); // Abstract method

    // Tune method
    public void tune(){ // Concrete method
        System.out.println(name + " is being tuned.");
    }

    // Setters and Getters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


}
