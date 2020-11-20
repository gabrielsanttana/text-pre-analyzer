package exceptions;

public class FailedToGenerateDigraphException extends RuntimeException {

  public FailedToGenerateDigraphException(String message) {
    super(message);
  }

  public FailedToGenerateDigraphException() {}
}
