package model;

import java.io.File;
import java.io.IOException;

public class CreatingFiles {
    public static void main(String[] args) throws IOException {
        File f = new File("file/product.txt");
        f.createNewFile();
        System.out.println(f.exists());
    }
}
