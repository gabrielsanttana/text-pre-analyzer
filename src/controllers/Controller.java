package controllers;

import java.io.FileNotFoundException;
import java.io.IOException;
import models.*;

public class Controller {

  public void processFile(String file) {
    String rawText = readFile(file);
    String[] formattedWords = serializeText(rawText);
    MultiMap<String, String> digraph = generateDigraph(formattedWords);
    String convertedDigraph = convertToCSVFormatter(digraph);
    writeFile(file, convertedDigraph);
  }

  public String readFile(String file) {

    String result = "";
    try {
      TextReader textReader = new TextReader();
      result = textReader.readFile(file);

    } catch (FileNotFoundException e) {
      System.out.println("File " + file + " was not found.");

    } catch (IOException e) {
      System.out.println("Error while trying to read file " + file);

    }

    return result;
  }

  public String[] serializeText(String text) {
    WordFormatter wordFormatter = new WordFormatter();

    return wordFormatter.serializeText(text);
  }

  public MultiMap<String, String> generateDigraph(String[] words) {
    DigraphGenerator digraphGenerator = new DigraphGenerator();

    return digraphGenerator.generate(words);
  }

  public String convertToCSVFormatter(MultiMap<String, String> lines) {
    DigraphConverter digraphConverter = new DigraphConverter();

    return digraphConverter.convert(lines);
  }

  public void writeFile(String filePath, String text) {
    TextWriter textWriter = new TextWriter();

    textWriter.writeFile(filePath, text);
  }
}
