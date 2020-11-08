package controllers;

import java.io.FileNotFoundException;
import java.io.IOException;
import models.*;
import models.exceptions.FailedToConvertDigraphException;
import models.exceptions.FailedToGenerateDigraphException;

/**
 * A class the servers as an interface between the MainView and the methods of the models
 */
public class Controller {

  /**
   * Executes the digraph processing flow
   * @param filePath the URL of the file to be processed
   */
  public void processFile(String filePath) {
    try {
      String rawText = readFile(filePath);
      String[] formattedWords = formatText(rawText);
      MultiMap<String, String> digraph = generateDigraph(formattedWords);
      String convertedDigraph = convertToCSV(digraph);
      writeFile(convertedDigraph, filePath);
    } catch (Exception e) {
      System.out.println("Error while processing file " + filePath);
    }
  }

  /**
   *
   * @param filePath the URL of the file to be read
   * @return a single string with the text from the given file
   * @throws java.lang.Exception
   */
  public String readFile(String filePath) throws Exception {
    try {
      TextReader textReader = new TextReader();
      return textReader.readFile(filePath);
    } catch (FileNotFoundException e) {
      System.out.println("File " + filePath + " was not found.");
    } catch (IOException e) {
      System.out.println("Error while trying to read file " + filePath);
    }

    return null;
  }

  /**
   *
   * @param text the raw text to be formatted
   * @return the formatted text without all the special characters
   * @throws java.lang.Exception
   */
  public String[] formatText(String text) throws Exception {
    try {
      WordFormatter wordFormatter = new WordFormatter();
      return wordFormatter.formatText(text);
    } catch (RuntimeException e) {
      System.out.println("Error while trying to format words from text file");
    }

    return null;
  }

  /**
   *
   * @param words an array of strings containing all file words
   * @return the digraph of the file words in a MultiMap structure
   * @throws models.exceptions.FailedToGenerateDigraphException
   */
  public MultiMap<String, String> generateDigraph(String[] words)
    throws FailedToGenerateDigraphException {
    try {
      DigraphGenerator digraphGenerator = new DigraphGenerator();
      return digraphGenerator.generate(words);
    } catch (FailedToGenerateDigraphException e) {
      System.out.println("Error generating digraph from list of words");
    }

    return null;
  }

  /**
   *
   * @param lines a MultipMap with the key being the first word of the line and the value being a collection of words (strings)
   * @return a digraph in a single string format
   * @throws models.exceptions.FailedToConvertDigraphException
   */
  public String convertToCSV(MultiMap<String, String> lines)
    throws FailedToConvertDigraphException {
    try {
      DigraphConverter digraphConverter = new DigraphConverter();
      return digraphConverter.convert(lines);
    } catch (FailedToConvertDigraphException e) {
      System.out.println("Error converting digraph to .csv format");
    }

    return null;
  }

  /**
   *  Writes the given text on the file from the given URL
   * @param text the text to be written on the file
   * @param filePath the URL of the file to be written
   * @throws java.io.IOException
   */
  public void writeFile(String text, String filePath) throws IOException {
    try {
      TextWriter textWriter = new TextWriter();
      textWriter.writeFile(text, filePath);
    } catch (IOException e) {
      System.out.println("Error while trying to write to file " + filePath);
    }
  }
}
