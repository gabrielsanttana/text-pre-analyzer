package views;

import controllers.Controller;
import java.util.Scanner;

public class Menu {

  private String[] files;

  public Menu(String[] files) {
    this.files = files;
  }

  public void printMenu() {
    Controller controller = new Controller();

    for (String file : files) {
      controller.readFile(file);
    }
  }
}
