package models;

import java.util.*;

public class DigraphConverter {

  public List<String> sortKeys(MultiMap<String, String> lines) {
    List<String> sortedKeys = new ArrayList<>(lines.getKeySet());
    Collections.sort(sortedKeys);

    return sortedKeys;
  }

  public String convert(MultiMap<String, String> lines) {
    StringBuilder serializedText = new StringBuilder();

    for (String nextWord : this.sortKeys(lines)) {
      serializedText.append(nextWord + ", " + lines.get(nextWord).toString().replace("[", "").replace("]", "") + "\n");
    }

    return serializedText.toString();
  }
}
