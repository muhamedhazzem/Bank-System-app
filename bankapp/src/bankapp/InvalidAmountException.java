package bankapp;

//mohazembank
class InvalidAmountException extends Exception {

    public InvalidAmountException() {
        super("Invalid amount for transaction.");
    }
    
}