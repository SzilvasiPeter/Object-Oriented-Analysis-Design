package chapter10;

import java.io.File;
import java.io.IOException;

public class LoadTester {
    public static void main(String[] args) {
        try {
            SubwayLoader subwayLoader = new SubwayLoader();
            Subway objectVille = subwayLoader.loadFromFile(new File("ObjectvilleSubway.txt"));
            System.out.println("Testing stations...");
            if( objectVille.hasStation("DRY Drive") &&
                objectVille.hasStation("Weather-O-Rama, Inc.") &&
                objectVille.hasStation("Boards 'R' Us")){
                System.out.println("... station test passed successfully");
            } else {
                System.out.println("... station test FAILED.");
                System.exit(-1);
            }

            System.out.println("Testing connections");
            if( objectVille.hasConnection("DRY Drive", "Head First Theather", "Meyer Line") &&
                objectVille.hasConnection("Weather-O-Rama, Inc.", "XHTML Expressway", "Wirfs-Brock-Line") &&
                objectVille.hasConnection("Head First Theatre", "Infinite Circle", "Rumbaugh Line")){
                System.out.println("... connection test passed successfully");
            } else {
                System.out.println(".... connection test FAILED.");
                System.exit(-1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
