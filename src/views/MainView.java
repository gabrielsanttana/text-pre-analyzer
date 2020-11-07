package views;

import controllers.Controller;

public abstract class MainView {

  public static void start(String args[]) {
    Controller controller = new Controller();

    for (String filePath : args) {
      String[] splitedFilePath = filePath.split("/");
      String fileName = splitedFilePath[splitedFilePath.length - 1];

      System.out.println("Working on " + fileName + "...");
      controller.processFile(filePath);
    }
  }

  public static void finish() {
    System.out.println("Finished!");
  }
}
