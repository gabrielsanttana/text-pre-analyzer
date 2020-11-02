import controllers.Controller;

public class Main {

  public static void main(String args[]) {
    Controller controller = new Controller();

    for (String fileName : args) {
      controller.processFile(fileName);
      //System.out.println("Working on " + fileName + " ...");
      System.out.println("Working on " + fileName + " ...");
    }

    //System.out.println(" Finished!");
    System.out.println("Finished!");
  }
}
