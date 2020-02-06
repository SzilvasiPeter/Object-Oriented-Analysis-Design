package chapter05;

import java.util.HashMap;
import java.util.Map;

public class InstrumentSpec {
    private Map properties;

    public InstrumentSpec(Map properties) {
        if(properties == null){
            this.properties = new HashMap();
        } else {
            this.properties = new HashMap(properties);
        }
    }

    public Object getProperty(String propertyName){
        return properties.get(propertyName);
    }

    public Map getProperties() {
        return properties;
    }

    public boolean matches(InstrumentSpec otherSpec){
        for(Object property : properties.keySet()){
            String propertyName = (String) property;
            if(properties.get(propertyName).equals(otherSpec.getProperty(propertyName))){
                return true;
            }
        }

        return false;
    }
}
