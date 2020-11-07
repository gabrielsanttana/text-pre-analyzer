package models;

import java.text.Normalizer;

/**
 * A class the serializes a given raw text, removing all the special characters
 */
public class WordFormatter {

  /**
   *
   * @param text the raw text to be formatted
   * @return the formatted text without all the special characters
   */
  public String[] formatText(String text) {
    String formattedText;

    formattedText =
      text
        .replaceAll("[():;.,#$%@*&!?\\-]", "")
        .replaceAll("\n+", "\n")
        .replaceAll("\n", " ")
        .trim()
        .replaceAll(" +", " ")
        .toLowerCase()
        .replaceAll("\r", "")
        .trim();

        /*
        
        .replaceAll("[áàâã]", "a")
        .replaceAll("[éèê]", "e")
        .replaceAll("[í]", "i")
        .replaceAll("[óôõ]", "o")
        .replaceAll("[ú]", "u")
        .replaceAll("[ç]", "c")
        
        */

    return formattedText.split(" ");
  }
}
