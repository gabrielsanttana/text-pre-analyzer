package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TextReader {

  public void printHello() {
    System.out.println("Hello, world!");
  }

  public String readFile(String path) {
    File f = new File(path);

    if (f.exists()) {
      BufferedReader br = null;
      try {
        br = new BufferedReader(new FileReader(f));
        
        String st;
        StringBuilder sb = new StringBuilder();
        while((st = br.readLine()) != null) {
            sb.append(st);
            sb.append("\n");
        }

        return sb.toString();
      } catch (Exception e) {}
    }

    return "";
  }
}
