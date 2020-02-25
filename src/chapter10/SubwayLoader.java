package chapter10;

import java.io.BufferedReader;
import java.io.IOException;

public class SubwayLoader {

    private Subway subway;

    public SubwayLoader() {
        this.subway = new Subway();
    }



    private void loadStation(Subway subway, BufferedReader reader) throws IOException{
        String currentLine;
        currentLine = reader.readLine();
        while(currentLine.length() > 0){
            subway.addStation(currentLine);
            currentLine = reader.readLine();
        }
    }

    private void loadConnection(Subway subway, BufferedReader reader, String lineName) throws IOException{
        String station1Name, station2Name;
        station1Name = reader.readLine();
        station2Name = reader.readLine();
        while((station2Name != null) && (station1Name.length() > 0)){
            subway.addConnection(station1Name, station2Name, lineName);
            station1Name = station2Name;
            station2Name = reader.readLine();
        }
    }
}
