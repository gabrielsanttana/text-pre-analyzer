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

        String st = br.readLine();
        StringBuilder sb = new StringBuilder(st);

        while (st != null) {
          st = br.readLine();
          if (st != null) {
            sb.append(st);
          }
        }

        return sb.toString();
      } catch (Exception e) {}
    }

    return "";
  }
}
