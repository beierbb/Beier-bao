public class RockPlanet extends Planet{
    private boolean habitable;
    public RockPlanet(int orbitTime, String destination, boolean habitable){
        super(orbitTime, destination);
        this.habitable = habitable;
    }
    public boolean isHabitable(){
        habitable = true;
        return true;
    }
    public void setHabitable(){
        habitable = false;
    }
    @Override
    public String toString(){
        return "Orbit time: " + orbitTime + ", Destination: " + destination + ", Is habitable: " + habitable;
    }
}
