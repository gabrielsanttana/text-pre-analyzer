package models;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextWriter {

  public void writeFile(String filePath, String text) {
    filePath = filePath.replace(".txt", ".csv");

    try {
      FileWriter fileWriter = new FileWriter(filePath);
      PrintWriter printWriter = new PrintWriter(fileWriter);

      printWriter.write(text);

      printWriter.close();
    } catch (IOException e) {}
  }
}
