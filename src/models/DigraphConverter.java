package models;

public class DigraphConverter {

  public String convert(MultiMap<String, String> lines) {
    StringBuilder serializedText = new StringBuilder();

    for (String nextWord : lines.getKeySet()) {
      serializedText.append(nextWord + ", " + lines.get(nextWord) + ";\n");
    }

    return serializedText.toString();
  }
}
