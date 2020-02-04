package chapter05;

public class MandolinSpec extends InstrumentSpec {

    private Style style;

    public MandolinSpec(Builder builder, String model, Type type, Style style, Wood backWood, Wood topWood) {
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    @Override
    public boolean matches(InstrumentSpec instrumentSpec) {
        if(!super.matches(instrumentSpec))
            return false;
        if(!(instrumentSpec instanceof MandolinSpec))
            return false;

        MandolinSpec spec = (MandolinSpec)instrumentSpec;
        if(!style.equals(spec.style))
            return false;

        return true;

    }
}
