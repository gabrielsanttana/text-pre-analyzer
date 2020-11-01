package controllers;

import models.FileReader;

public class Controller {

  public void printHello() {
    FileReader fileReader = new FileReader();

    fileReader.printHello();
  }

  public void readFile(String file) {
    FileReader fileReader = new FileReader();

    fileReader.readFile(file);
  }
}
