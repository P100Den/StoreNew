package model;

import java.io.File;
import java.io.FilenameFilter;

public class MyFile implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        return false;
    }
}
