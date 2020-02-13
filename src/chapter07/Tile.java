package chapter07;

import java.util.ArrayList;
import java.util.List;

public class Tile {

    private List units;

    public Tile() {
        this.units = new ArrayList();
    }

    public void addUnit(Unit unit){
        units.add(unit);
    }

    public void removeUnit(Unit unit){
        units.remove(unit);
    }

    protected void removeUnits()
    {

    }

    public List getUnits(){
        return units;
    }
}
