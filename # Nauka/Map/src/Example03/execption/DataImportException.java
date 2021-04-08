package Example03.execption;

public class DataImportException extends RuntimeException{
    public DataImportException (String message) {
        super(message);
    }
}
