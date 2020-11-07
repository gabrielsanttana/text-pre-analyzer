package controllers;

import models.*;

/**
 * A class the servers as an interface between the MainView and the methods of the models
 */
public class Controller {

  /**
   * Executes the digraph processing flow
   * @param filePath the URL of the file to be processed
   */
  public void processFile(String filePath) {
    String rawText = readFile(filePath);
    String[] formattedWords = formatText(rawText);
    MultiMap<String, String> digraph = generateDigraph(formattedWords);
    String convertedDigraph = convertToCSVFormatter(digraph);
    writeFile(convertedDigraph, filePath);
  }

  /**
   *
   * @param filePath the URL of the file to be read
   * @return a single string with the text from the given file
   */
  public String readFile(String file) {
    TextReader textReader = new TextReader();

    return textReader.readFile(file);
  }

  /**
   *
   * @param text the raw text to be formatted
   * @return the formatted text without all the special characters
   */
  public String[] formatText(String text) {
    WordFormatter wordFormatter = new WordFormatter();

    return wordFormatter.formatText(text);
  }

  /**
   *
   * @param words an array of strings containing all file words
   * @return the digraph of the file words in a MultiMap structure
   */
  public MultiMap<String, String> generateDigraph(String[] words) {
    DigraphGenerator digraphGenerator = new DigraphGenerator();

    return digraphGenerator.generate(words);
  }

  /**
   *
   * @param lines a MultipMap with the key being the first word of the line and the value being a collection of words (strings)
   * @return a digraph in a single string format
   */
  public String convertToCSVFormatter(MultiMap<String, String> lines) {
    DigraphConverter digraphConverter = new DigraphConverter();

    return digraphConverter.convert(lines);
  }

  /**
   *  Writes the given text on the file from the given URL
   * @param text the text to be written on the file
   * @param filePath the URL of the file to be written
   */
  public void writeFile(String text, String filePath) {
    TextWriter textWriter = new TextWriter();

    textWriter.writeFile(text, filePath);
  }
}
