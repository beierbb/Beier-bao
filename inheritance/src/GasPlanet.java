import java.awt.*;

public class GasPlanet extends Planet {
    private boolean hasRings;
    private Color color;
    public GasPlanet(int orbitTime, String destination, boolean hasRings, Color color){
        super(orbitTime, destination);
        this.hasRings = hasRings;
        this.color = color;
    }
    public boolean isHasRings(){
        hasRings = true;
        return true;
    }

    public void setHasRings(){
        hasRings = false;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(){
        color = null;
    }
    @Override
    public String toString(){
        return "Orbit time: " + orbitTime + ", Destination: " + destination + ", Has Rings: " + hasRings + ", Color: " + color;
    }
}