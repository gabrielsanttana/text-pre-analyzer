package models;

/**
 * A class the generates and returns digraphs based on an array of strings
 */
import java.util.Collection;
import utils.MultiMap;
import exceptions.FailedToGenerateDigraphException;

public class DigraphGenerator {

  /**
   *
   * @param words an array of strings containing all file words
   * @return the digraph of the file words in a MultiMap structure
   * @throws models.exceptions.FailedToGenerateDigraphException
   */
  public MultiMap<String, String> generate(String[] words)
    throws FailedToGenerateDigraphException {
    MultiMap<String, String> digraph = new MultiMap<>();

    for (int i = 0; i < words.length - 1; i++) {
      Collection<String> associatedWords = digraph.get(words[i]);
      if (
        (associatedWords == null) ||
        (associatedWords != null && !associatedWords.contains(words[i + 1]))
      ) {
        digraph.put(words[i], words[i + 1]);
      }
    }

    return digraph;
  }
}
