package chapter05;

public class GuitarSpec extends InstrumentSpec {
    private int numberOfStrings;

    public GuitarSpec(Builder builder, String model, Type type, int numberOfStrings, Wood backWood, Wood topWood) {
        super(builder, model, type, backWood, topWood);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        if(!super.matches(otherSpec))
            return  false;
        if(!(otherSpec instanceof GuitarSpec))
            return false;

        GuitarSpec guitarSpec = (GuitarSpec)otherSpec;
        if (numberOfStrings != guitarSpec.numberOfStrings)
            return false;

        return true;
    }
}
