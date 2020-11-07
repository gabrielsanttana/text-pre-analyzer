import views.MainView;

public class Main {

  /**
   * Executes the program main thread
   * @param args an array of strings containing all the passed command line arguments
   */
  public static void main(String args[]) {
    MainView.start(args);
    MainView.finish();
  }
}
