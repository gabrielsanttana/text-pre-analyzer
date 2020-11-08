package models.exceptions;

public class CsvFileNotCreatedException extends RuntimeException {
  public CsvFileNotCreatedException(String message) { super(message); }
  public CsvFileNotCreatedException() { }
}
