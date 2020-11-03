package controllers;

import models.FileFormatter;
import models.TextReader;
import models.TextWriter;

public class Controller {

  public void printHello() {
    TextReader textReader = new TextReader();

    textReader.printHello();
  }

  public void processFile(String file) {
    String rawText = readFile(file);
    String formattedText = serializeText(rawText);

    writeFile(file, formattedText);
  }

  public String readFile(String file) {
    TextReader textReader = new TextReader();

    return textReader.readFile(file);
  }

  public String serializeText(String text) {
    FileFormatter fileFormatter = new FileFormatter();

    return fileFormatter.serializeText(text);
  }

  public void writeFile(String filePath, String text) {
    TextWriter textWriter = new TextWriter();

    textWriter.writeFile(filePath, text);
  }
}
