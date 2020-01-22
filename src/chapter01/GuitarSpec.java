package chapter01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numberOfStrings;

    public GuitarSpec(Builder builder, String model, Type type, int numberOfStrings, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numberOfStrings = numberOfStrings;
    }

    public Builder getBuilder() {
        return builder;
    }


    public String getModel() {
        return model;
    }


    public Type getType() {
        return type;
    }


    public Wood getBackWood() {
        return backWood;
    }


    public Wood getTopWood() {
        return topWood;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public boolean matches(GuitarSpec searchGuitar) {
        if (builder != searchGuitar.builder)
            return false;
        if ((model != null) && (!model.equals("")) &&  (!model.equals(searchGuitar.model)))
            return false;
        if (type != searchGuitar.type)
            return false;
        if (backWood != searchGuitar.backWood)
            return false;
        if (topWood != searchGuitar.topWood)
            return false;
        if (numberOfStrings != searchGuitar.numberOfStrings)
            return false;

        return true;
    }
}
