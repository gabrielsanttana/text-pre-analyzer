package controllers;

import models.DigraphConverter;
import models.WordFormatter;
import models.DigraphGenerator;
import models.MultiMap;
import models.TextReader;
import models.TextWriter;

public class Controller {

  public void processFile(String file) {
    String rawText = readFile(file);
    String[] formattedWords = serializeText(rawText);
    MultiMap<String, String> digraph = generateDigraph(formattedWords);
    String convertedDigraph = convertToCSVFormatter(digraph);
    writeFile(file, convertedDigraph);
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

  public void writeFile(String filePath, String text) {
    TextWriter textWriter = new TextWriter();

    textWriter.writeFile(filePath, text);
  }
}
