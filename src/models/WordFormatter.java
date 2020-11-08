package models;

/**
 * A class the serializes a given raw text, removing all the special characters
 */
public class WordFormatter {

  /**
   *
   * @param text the raw text to be formatted
   * @return the formatted text without all the special characters
     * @throws java.lang.RuntimeException
   */
  public String[] formatText(String text) throws RuntimeException {
    String formattedText;

    formattedText = text.replaceAll("[\\(\\):;.#$@*&!?{}\\“\\”]", "").replaceAll("\\[", "")
        .replaceAll("\\]", "").replaceAll("[-–][^a-zA-Z]", "").replaceAll(",", "")
        .replaceAll("/ ([--⁃–])/g", "").replaceAll("–a", "a").replaceAll("\n+", "\n")
        .replaceAll("\n", " ").trim().replaceAll(" +", " ").toLowerCase().replaceAll("\r", "")
        .trim();

    return formattedText.split(" ");
  }
}
