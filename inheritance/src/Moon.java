public class Moon {
    private Planet planet;
    private int orbitTime;
    private boolean atmosphere;
    private String destination;
    public Moon(Planet planet, int orbitTime, boolean atmosphere, String destination){
        this.planet = planet;
        this.orbitTime = orbitTime;
        this.atmosphere = atmosphere;
        this.destination = destination;
    }
    public String getDestination(){
        return destination;
    }

    public void setDestination(){
        destination = null;
    }

    public Planet getPlanet(){
        return planet;
    }

    public void setPlanet(){
        planet = null;
    }

    public int getOrbitTime(){
        return orbitTime;
    }

    public void setOrbitTime(){
        orbitTime = 0;
    }

    public boolean isAtmosphere(){
        atmosphere = true;
        return true;
    }

    public void setAtmosphere(){
        atmosphere = false;
    }
    public boolean equals(Object object){
        if (object instanceof Moon){
            Moon other = (Moon) object;
        }
        return false;
    }
    @Override
    public String toString(){
        return "Planet: " + planet + ", Orbit time: " + orbitTime + ", Destination: " + destination + ", Atmosphere: " + atmosphere;
    }
}
