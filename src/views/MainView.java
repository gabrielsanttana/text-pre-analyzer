package views;

import controllers.Controller;

public abstract class MainView {

  public static void start(String args[]) {
    Controller controller = new Controller();

    for (String filePath : args) {
      String[] fileName = filePath.split("/");
      System.out.println("Working on " + fileName[fileName.length - 1] + "...");
      controller.processFile(filePath);
    }
  }

  public static void finish() {
    System.out.println("Finished!");
  }
}
