package models;

import java.util.*;

/**
 * A class the converts dipraghs into single strings
 */
public class DigraphConverter {

  /**
   *
   * @param digraph a MultipMap with the key being the first word of the line and the value being a collection of words (strings)
   * @return all MultiMap keys in alphabetical order
   */
  public List<String> sortKeys(MultiMap<String, String> digraph) {
    List<String> sortedKeys = new ArrayList<>(digraph.getKeySet());

    Collections.sort(sortedKeys);

    return sortedKeys;
  }

  /**
   *
   * @param digraph a MultipMap with the key being the first word of the line and the value being a collection of words (strings)
   * @return a digraph in a single string format
   */
  public String convert(MultiMap<String, String> digraph) {
    StringBuilder formattedText = new StringBuilder();

    for (String nextWord : this.sortKeys(digraph)) {
      formattedText.append(nextWord + ", " + digraph.get(nextWord) + ";\n");
    for (String nextWord : this.sortKeys(lines)) {
      serializedText.append(nextWord + ", " + lines.get(nextWord).toString().replace("[", "").replace("]", "") + "\n");
    }

    return formattedText.toString();
  }
}
