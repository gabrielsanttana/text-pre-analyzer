package models;

import java.text.Normalizer;

public class FileFormatter {

  public String serializeText(String text) {
    String serializedText;

    serializedText = text
      .replaceAll("[():;.,#$%@*&!?\\-]", "")
      .replaceAll("\n+", "\n")
      .replaceAll("\n", " ")
      .trim()
      .replaceAll(" +", " ")
      .toLowerCase()
      .replaceAll("\r", "")
      .replaceAll("[^a-záàâã\\-\\d ]", "a")
      .replaceAll("[^a-zéèê\\-\\d ]", "e")
      .replaceAll("[^a-zí\\-\\d ]", "i")
      .replaceAll("[^a-zóôõ\\-\\d ]", "o")
      .replaceAll("[^a-zú\\-\\d ]", "u")
      .replaceAll("[^a-zç\\-\\d ]", "c")
      .trim();

    serializedText = Normalizer.normalize(serializedText, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");

    return serializedText;
  }
}
