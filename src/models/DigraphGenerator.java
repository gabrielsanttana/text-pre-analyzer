package models;

import java.util.Collection;

public class DigraphGenerator {

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
