package Sudoku;

import test.html.java.Main;

public class MainBrwsr {
    static {
        try {
            Main.onPageLoad();
        } catch (Exception ex) {
            throw new IllegalStateException(ex);
        }
    }
}
