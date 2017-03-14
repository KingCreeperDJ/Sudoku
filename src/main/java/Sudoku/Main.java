package Sudoku;

import net.java.html.boot.BrowserBuilder;


/** Bootstrap and initialization. */
public final class Main {
    private Main() {
    }
    
    /** Launches the browser */
    public static void main(String... args) throws Exception {
        BrowserBuilder.newBrowser().
            loadPage("Sudoku/index.html").
            loadClass(Main.class).
            invoke("onPageLoad", args).
            showAndWait();
        System.exit(0);
        
        Field test = new Field();
        test.createField(9, 9);
        test.insert(1, 1, 5, test);
        
        test.fillField(test);
        test.printArray(test);
        
        Field test2 = new Field();
        test2.createField(3, 3);
        test.printArray(test2);
    }
    
    /** Called when page is ready */
    public static void onPageLoad(String... args) throws Exception {
        
    }
}
