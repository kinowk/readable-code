package cleancode.minesweeper.tobe.cell;

public interface Cell {


    boolean isLandMine();

    boolean hasLandMineCount();

    CellSnapshot getSnapshot();

    void flag();

    void open();

    boolean isOpened();

    boolean isChecked();
}
