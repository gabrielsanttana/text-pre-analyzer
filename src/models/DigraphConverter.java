package models;

import java.util.*;

/**
 * A class the converts dipraghs into single strings
 */
public class DigraphConverter {

  /**
   *
   * @param lines a MultipMap with the key being the first word of the line and the value being a collection of words (strings)
   * @return all MultiMap keys in alphabetical order
   */
  public List<String> sortKeys(MultiMap<String, String> lines) {
    List<String> sortedKeys = new ArrayList<>(lines.getKeySet());
    Collections.sort(sortedKeys);

    return sortedKeys;
  }

  /**
   *
   * @param lines a MultipMap with the key being the first word of the line and the value being a collection of words (strings)
   * @return a digraph in a single string format
   */
  public String convert(MultiMap<String, String> lines) {
    StringBuilder serializedText = new StringBuilder();

    for (String nextWord : this.sortKeys(lines)) {
      serializedText.append(nextWord + ", " + lines.get(nextWord) + ";\n");
    }

    return serializedText.toString();
  }
}
