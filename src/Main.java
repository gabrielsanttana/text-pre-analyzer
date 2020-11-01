import controllers.Controller;

public class Main {

  public static void main(String args[]) {
    Controller controller = new Controller();

    for (String fileName : args) {
      System.out.println("⚙️ Working on " + fileName + " ...");
    }

    System.out.println("🚀 Finished!");
  }
}
