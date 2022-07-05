package taller01;

/**
 * It represents the CuentaBancaria class and the getter and setter methods for the accountNumber
 * and activated attribute.
 * @author: Joan Peralta Collante
 */
public class CuentaBancaria {
    /**
     * It represents the attribute of type int accountNumber in the CuentaBancaria class.
     */
    private int accountNumber;
    /**
     * It represents the attribute of type boolean activated in the CuentaBancaria class.
     */
    protected boolean activated;

    /**
     * Create an instance of class CuentaBancaria
     * @param accountNumber The account number of user
     * @param activated The status of the bank account (active or inactive)
     */
    public CuentaBancaria(int accountNumber, boolean activated){
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    /**
     * Setter method of the accountNumber attribute
     * @param accountNumber The accountNumber attribute passed as an argument
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Getter method of the accountNumber attribute
     * @return Returns the value of the account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Setter method of the activated attribute
     * @param activated The activated attribute passed as an argument
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Getter method of the activated attribute
     * @return Returns the statement of the bank account
     */
    public boolean getActivated() {
        return activated;
    }
}
