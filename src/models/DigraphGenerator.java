package models;

public class DigraphGenerator {

  public MultiMap<String, String> generate(String[] words) {
    MultiMap<String, String> digraph = new MultiMap<>();

    for (int i = 0; i < words.length - 1; i++) {
      digraph.put(words[i], words[i + 1]);
    }

    return digraph;
  }
}
