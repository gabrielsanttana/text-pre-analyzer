package models;

public class FileReader {

  public void printHello() {
    System.out.println("Hello, world!");
  }

  public void readFile(String path) {
    File f = new File(path);

    if (f.exists()) {
      BufferedReader br = new BufferedReader(new FileReader(f));

      String st;
      while (st = br.readLine() != null) {
        System.out.println(st);
      }
    }
  }
}
