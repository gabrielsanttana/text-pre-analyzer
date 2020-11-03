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

    String t = "anos, de\n"+
    "data, querida\n"+
    "de, vida\n"+    
    "felicidades, muitos\n"+   
    "muitas, felicidades\n"+   
    "muitos, anos\n"+  
    "nesta, data\n"+  
    "parabéns, pra\n"+  
    "pra, você\n"+  
    "querida, muitas\n"+  
    "você, nesta\n";

    writeFile(file, formattedText);

    //System.out.println(formattedText);
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
