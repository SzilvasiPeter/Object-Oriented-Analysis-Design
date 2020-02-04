package chapter05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        this.guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, int price, GuitarSpec guitarSpec){
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchGuitar){
        List<Guitar> matchingGuitars = new ArrayList<Guitar>();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            GuitarSpec guitarSpec = (GuitarSpec)guitar.getSpec();
            if(guitarSpec.matches(searchGuitar))
                matchingGuitars.add(guitar);
        }

        return matchingGuitars;
    }
}
