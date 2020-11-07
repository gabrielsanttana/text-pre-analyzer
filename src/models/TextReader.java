package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

/**
 * A class the reads and returns a string with the text contained in a given file
 */
public class TextReader {

  /**
   *
   * @param filePath the URL of the file to be read
   * @return a single string with the text from the given file
   */
  public String readFile(String filePath) {
    File file = new File(filePath);

    if (file.exists()) {
      BufferedReader bufferedReader = null;
  public String readFile(String path) throws IOException, FileNotFoundException {
    File f = new File(path);

      try {
        bufferedReader = new BufferedReader(new FileReader(file));

        String fileString;
        StringBuilder stringBuilder = new StringBuilder();

        while ((fileString = bufferedReader.readLine()) != null) {
          stringBuilder.append(fileString);
          stringBuilder.append("\n");
        }

        bufferedReader.close();

        return stringBuilder.toString();
      } catch (Exception e) {}
    }
        return sb.toString();
      } catch (IOException e) {
        throw e;
      }

    } else {
      throw new FileNotFoundException("");
    }
  }
}
