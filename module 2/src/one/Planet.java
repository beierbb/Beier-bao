package one;

public class Planet {
    private String designation;
    private double massKg;
    private double orbitEarthYears;
    private PlanetType type;
//defining class Planet
    public Planet(String designation, PlanetType type){
        this.designation = designation;
        this.type = type;
    }

    public Planet(String designation, double massKg, double orbitEarthYears, PlanetType type) {
        this.designation = designation;
        this.massKg = massKg;
        this.orbitEarthYears = orbitEarthYears;
        this.type = type;
    }
    @Override
    public String toString(){
        return "Planet: Destination = " + designation + ", Mass(kg) = " + massKg + "Orbit(earth years) = " +
                orbitEarthYears + "Planet Type" + type;
    }
}