package models;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * A class that writes text from .txt files on .csv files
 */
public class TextWriter {

  /**
   *  Writes the given text on the file from the given URL
   * @param text the text to be written on the file
   * @param filePath the URL of the file to be written
   */
  public void writeFile(String text, String filePath) throws IOException {
    filePath = filePath.replace(".txt", ".csv");

    FileWriter fileWriter = new FileWriter(filePath);
    PrintWriter printWriter = new PrintWriter(fileWriter);

    printWriter.write(text);

    printWriter.close();
    fileWriter.close();
  }
}
