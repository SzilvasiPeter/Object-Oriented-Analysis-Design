package chapter05;

import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List inventory;

    public Inventory() {
        this.inventory = new LinkedList();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec){
        Instrument instrument = null;
        if(spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, spec);
        } else if(spec instanceof MandolinSpec){
            instrument = new Mandolin(serialNumber, price, spec);
        }

        inventory.add(instrument);
    }

    public Instrument get(String serialNumber){
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Instrument instrument = (Instrument) i.next();
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchGuitar){
        List<Guitar> matchingGuitars = new ArrayList<Guitar>();
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            GuitarSpec guitarSpec = (GuitarSpec)guitar.getSpec();
            if(guitarSpec.matches(searchGuitar))
                matchingGuitars.add(guitar);
        }

        return matchingGuitars;
    }

    public List search(MandolinSpec searchMandolin){
        List<Mandolin> matchingMandolin = new ArrayList<Mandolin>();
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Mandolin guitar = (Mandolin)i.next();
            MandolinSpec mandolinSpec = (MandolinSpec) guitar.getSpec();
            if(mandolinSpec.matches(searchMandolin))
                matchingMandolin.add(guitar);
        }

        return matchingMandolin;
    }
}
