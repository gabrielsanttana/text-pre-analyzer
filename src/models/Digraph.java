package models;

import java.util.HashMap;

public class Digraph {

  HashMap<String, ArrayList<String>> wordsMap = new HashMap<>();

  public Digraph(String[] words) {
    for (int i = 0; i < words.length; i++) {
      if (i < words.length-1) {
        wordsMap.add(words[i], words[i+1]);
      }
    }
    /*
    for (int i = 0; i < words.length; i++) {
      if (i < words.length-1) {
        if (wordsMap.get(words[i]) == null)
          wordsMap.put(words[i], new ArrayList<String>());

        wordsMap.get(words[i]).add(words[i+1]);
      }
    }
    */
  }

  public String convertToString(
    HashMap<String, String> wordsMap,
    char separatorCharacter
  ) {
    return "";
  }
}
