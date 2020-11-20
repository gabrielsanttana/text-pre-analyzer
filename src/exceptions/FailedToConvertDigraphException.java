package exceptions;

public class FailedToConvertDigraphException extends RuntimeException {

  public FailedToConvertDigraphException(String message) {
    super(message);
  }

  public FailedToConvertDigraphException() {}
}
