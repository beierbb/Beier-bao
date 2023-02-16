import java.util.ArrayList;

public class Planet {
    int orbitTime;
    ArrayList<Moon> moons;
    String destination;
    public Planet(orbitTime, moons, destination){
        this.moons = moons;
        this.destination = destination;
    }

}
