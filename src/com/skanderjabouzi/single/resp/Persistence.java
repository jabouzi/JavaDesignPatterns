package com.skanderjabouzi.single.resp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Persistence {

    public void saveToFile(Journal journal, String filename, boolean overwrite) {
        if (overwrite || new File(filename).exists()) {
            try (PrintStream out  = new PrintStream(filename)) {
                out.println(journal);
            } catch (FileNotFoundException e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
}
