package models;

/**
 * A class the generates and returns digraphs based on an array of strings
 */
public class DigraphGenerator {

  /**
   *
   * @param words an array of strings containing all file words
   * @return the digraph of the file words in a MultiMap structure
   */
  public MultiMap<String, String> generate(String[] words) {
    MultiMap<String, String> digraph = new MultiMap<>();

    for (int i = 0; i < words.length - 1; i++) {
      digraph.put(words[i], words[i + 1]);
    }

    return digraph;
  }
}
