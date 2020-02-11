package chapter07;

import java.util.ArrayList;
import java.util.List;
import java.util.spi.AbstractResourceBundleProvider;

public class Board {

    private int width, height;
    private List tiles;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        initialize();
    }

    private void initialize() {
        tiles = new ArrayList();
        for (int i = 0; i < width; i++) {
            tiles.add(i, new ArrayList(height));
            for (int j = 0; j < height; j++) {
                ((ArrayList) tiles.get(i)).add(j, new Title());
            }
        }
    }

    public Title getTitle(int x, int y) {
        return (Title) ((ArrayList) tiles.get(x - 1)).get(y - 1);
    }

    public void addUnit(Unit unit, int x, int y) {
        Tile tile = getTile(x, y);
        tile.addUnit(unit);
    }

    public void removeUnits(int x, int y) {
        Tile tile = getTile(x, y);
        tile.removeUnits();
    }

    public List getUnits(int x, int y) {
        return getTile(x, y).getUnits();
    }
}
