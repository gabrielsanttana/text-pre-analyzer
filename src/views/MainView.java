package views;

import controllers.Controller;

/**
 * An abstract class that calls the controller ad the prints out the program main flow as a feedback for the user
 */
public abstract class MainView {

  /**
   * Starts the processing of the given files and prints out a message indicating the start of the program execution
   * @param args the command line arguments containing the files URLs received from the Main class
   */
  public static void start(String args[]) {
    Controller controller = new Controller();

    for (String filePath : args) {
      String[] splitedFilePath = filePath.split("/");
      String fileName = splitedFilePath[splitedFilePath.length - 1];

      System.out.println("Working on " + fileName + "...");
      controller.processFile(filePath);
    }
  }

  /**
   * Prints out a message indicating the conclusion of the program execution
   */
  public static void finish() {
    System.out.println("Finished!");
  }
}
