package models;

/**
 * A class the serializes a given raw text, removing all the special characters
 */
public class WordFormatter {

  /**
   *
   * @param text the raw text to be formatted
   * @return the formatted text without all the special characters
   */
  public String[] formatText(String text) throws RuntimeException {
    String formattedText;

    formattedText = text.replaceAll("[():;.,#$%@*&!?{}]", "").replaceAll("\\[\\]", "").replaceAll(" (-)+", "")
        .replaceAll("\n+", "\n").replaceAll("\n", " ").trim().replaceAll(" +", " ").toLowerCase().replaceAll("\r", "")
        .trim();

    return formattedText.split(" ");
  }
}
