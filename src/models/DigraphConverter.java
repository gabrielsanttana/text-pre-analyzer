package models;

import java.util.*;
import utils.MultiMap;
import exceptions.FailedToConvertDigraphException;

/**
 * A class the converts digraphs into single strings
 */
public class DigraphConverter {

  /**
   *
   * @param digraph a MultipMap with the key being the first word of the line and the value being a collection of words (strings)
   * @return all MultiMap keys in alphabetical order
   * @throws models.exceptions.FailedToConvertDigraphException
   */
  public List<String> sortKeys(MultiMap<String, String> digraph)
    throws FailedToConvertDigraphException {
    List<String> sortedKeys = new ArrayList<>(digraph.getKeySet());

    Collections.sort(sortedKeys);

    return sortedKeys;
  }

  /**
   *
   * @param digraph a MultipMap with the key being the first word of the line and the value being a collection of words (strings)
   * @return a digraph in a single string format
   * @throws models.exceptions.FailedToConvertDigraphException
   */
  public String convert(MultiMap<String, String> digraph)
    throws FailedToConvertDigraphException {
    StringBuilder formattedText = new StringBuilder();

    for (String nextWord : this.sortKeys(digraph)) {
      String connectedWords = digraph
        .get(nextWord)
        .toString()
        .replaceAll("\\[", "")
        .replaceAll("]", "");
      formattedText.append(nextWord + ", " + connectedWords + "\n");
    }

    return formattedText.toString();
  }
}
