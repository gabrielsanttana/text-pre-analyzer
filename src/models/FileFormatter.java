package models;

public class FileFormatter {

  public String serializeText(String text) {
    String serializedText;

    serializedText =
      text
        .replaceAll("\n", " ")
        .toLowerCase()
        .replaceAll("\r", "")
        .replaceAll("[^a-záàâãéèêíóôõúç\\-\\d ]", "")
        .trim();

    return serializedText;
  }
}
