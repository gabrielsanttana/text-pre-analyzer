package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * A class the reads and returns a string with the text contained in a given file
 */
public class TextReader {

  /**
   *
   * @param filePath the URL of the file to be read
   * @return a single string with the text from the given file
   */
  public String readFile(String filePath) {
    File f = new File(filePath);

    if (f.exists()) {
      BufferedReader br = null;
      try {
        br = new BufferedReader(new FileReader(f));

        String st;
        StringBuilder sb = new StringBuilder();
        while ((st = br.readLine()) != null) {
          sb.append(st);
          sb.append("\n");
        }

        return sb.toString();
      } catch (Exception e) {}
    }

    return "";
  }
}
