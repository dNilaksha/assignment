package bankaccounts;

public class CreditException extends Exception {

    public CreditException() {
        super();
    }

    public CreditException(String message) {
        super(message);
    }

    public CreditException(String message, Throwable cause) {
        super(message, cause);
    }
}
