package controllers;

import models.FileFormatter;
import models.TextReader;

public class Controller {

  public void printHello() {
    TextReader textReader = new TextReader();

    textReader.printHello();
  }

  public void processFile(String file) {
    String rawText = readFile(file);
    String formattedText = serializeText(rawText);
    
    System.out.println(formattedText);
  }

  public String readFile(String file) {
    TextReader textReader = new TextReader();

    return textReader.readFile(file);
  }

  public String serializeText(String text) {
    FileFormatter fileFormatter = new FileFormatter();

    return fileFormatter.serializeText(text);
  }
}
