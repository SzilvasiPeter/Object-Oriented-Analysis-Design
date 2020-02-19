package chapter07;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Unit {

    private String type;
    private int id;
    private List weapons;
    private String name;
    private Map properties;

    public Unit(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List getWeapons() {
        return weapons;
    }

    public void addWeapon(Weapon weapon) {
        if(weapons != null){
            weapons = new LinkedList();
        }
        weapons.add(weapon);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map getProperties() {
        return properties;
    }

    public void setProperties(Map properties) {
        this.properties = properties;
    }
}
