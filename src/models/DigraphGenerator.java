package models;

import java.util.Collection;

public class DigraphGenerator {

  /**
   *
   * @param words an array of strings containing all file words
   * @return the digraph of the file words in a MultiMap structure
   */
  public MultiMap<String, String> generate(String[] words) {
    MultiMap<String, String> digraph = new MultiMap<>();

    for (int i = 0; i < words.length - 1; i++) {

      Collection<String> associatedWords = digraph.get(words[i]);
      if ((associatedWords == null) || (associatedWords != null && !associatedWords.contains(words[i + 1]))) {

        System.out.println("TESTE");
        digraph.put(words[i], words[i + 1]);
      }
    }

    return digraph;
  }
}
