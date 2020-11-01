package views;

import controllers.Controller;
import java.util.Scanner;

public class Menu {

  public void printMenu() {
    Controller controller = new Controller();

    System.out.println("Boas-vindas! Escolha uma das opções:");

    System.out.println("1 - Printar hello");

    Scanner scanner = new Scanner(System.in);

    int option = scanner.nextInt();

    switch (option) {
      case 1:
        controller.printHello();
    }

    scanner.close();
  }
}
