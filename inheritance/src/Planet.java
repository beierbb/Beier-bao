import java.util.ArrayList;
import java.util.List;

public class Planet {
    private int orbitTime;
    private String destination;
    private ArrayList<Moon> moons;
    public Planet(int orbitTime, String destination){
        this.orbitTime = orbitTime;
        this.destination = destination;
    }

    public String getDestination(){
        return destination;
    }

    public void setDestination(){
        destination = null;
    }

    public int getOrbitTime(){
        return orbitTime;
    }

    public void setOrbitTime(){
        orbitTime = 0;
    }
    public void addMoon(){
        moons.add();
    }
    public List<Moon> getMoons(){
        List<Moon> moonList = List.of();
        return moonList;
    }

    public boolean equals(Object object){
        if (object instanceof Planet){
            Planet other = (Planet) object;
        }
        return false;
    }
    @Override
    public String toString(){
        return "Orbit time: " + orbitTime + ", Destination: " + destination + ", Location: " + moons;
    }
}