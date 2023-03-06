package one;

import java.util.Objects;

public class PlanetType {
    String typename;
    public PlanetType(String typename){
        this.typename = typename;
    }
//generate the hash value
    @Override
    public int hashCode() {
        return typename.hashCode();
    }
//make sure it's the correct type
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PlanetType name){
            if (Objects.equals(this.typename, name.typename)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return " " + typename;
    }
}
