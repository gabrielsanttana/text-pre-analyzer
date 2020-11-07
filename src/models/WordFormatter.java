package models;

import java.text.Normalizer;

public class WordFormatter {

  public String[] serializeText(String text) {
    String serializedText;

    serializedText =
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

    return serializedText.split(" ");
  }
}
