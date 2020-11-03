package models;

import java.text.Normalizer;

public class FileFormatter {

  public String serializeText(String text) {
    String serializedText;

    serializedText =
      text
        .replaceAll("[–.,]", "")
        .replaceAll("\n+","\n")
        .replaceAll("\n", " ")
        .trim()
        .replaceAll(" +", " ")
        .toLowerCase()
        .replaceAll("\r", "")
        .trim();
    
    //.replaceAll("[^a-záàâãéèêíóôõúç\\-\\d ]", "")
    
    serializedText = 
      Normalizer
        .normalize(serializedText, Normalizer.Form.NFD)
        .replaceAll("[^\\p{ASCII}]", "");

    return serializedText;
  }
}
