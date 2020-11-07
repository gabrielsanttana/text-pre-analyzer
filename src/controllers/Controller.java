package controllers;

import models.*;

public class Controller {

  public void processFile(String filePath) {
    String rawText = readFile(filePath);
    String[] formattedWords = serializeText(rawText);
    MultiMap<String, String> digraph = generateDigraph(formattedWords);
    String convertedDigraph = convertToCSVFormatter(digraph);
    writeFile(convertedDigraph, filePath);
  }

  public String readFile(String file) {
    TextReader textReader = new TextReader();

    return textReader.readFile(file);
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

  public void writeFile(String text, String filePath) {
    TextWriter textWriter = new TextWriter();

    textWriter.writeFile(text, filePath);
  }
}
