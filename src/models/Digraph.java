package models;

import java.util.HashMap;

public class Digraph {

  HashMap<String, String> wordsMap = new HashMap<>();

  public Digraph(String[] words) {
    for (String word : words) {
      wordsMap.put(word, word);
    }
  }

  public String convertToString(
    HashMap<String, String> wordsMap,
    char separatorCharacter
  ) {
    return "";
  }
}
