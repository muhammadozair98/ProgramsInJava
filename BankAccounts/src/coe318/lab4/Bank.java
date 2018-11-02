package coe318.lab4;
/**
 *Muhammad Ozair    500763463
 *Section: 071
 */
public class Bank {
    private String name;
    /**
     * An array of Accounts managed by
     * this bank.
     */
    private Account [] Acco;
    private int numAccounts;

    public Bank(String name, int maxNumberAccounts) {
        this.name = name;
        Acco = new Account[maxNumberAccounts];
        numAccounts = 0;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;  //Fix this
    }

    /**
     * @return the numAccounts
     */
    public int getNumAccounts() {
        return numAccounts; //Fix this
    }


    public Account[] getAccounts() {
        return Acco; //Fix this
    }

    /**
     * Return true if the Bank already has an account
     * with this number; otherwise false.
     * @param accountNumber
     * @return
     */
    public boolean hasAccountNumber(int accountNumber) {
        for (int i=0; i<numAccounts; i = i+1){
            if (accountNumber == Acco [i].getNumber())
        return true; //Fix this
    }
        return false; 
}

    /**
     * Adds the specified account to the Bank if possible. If the account number
     * already exists or the Bank has reached its maximum
     * number of accounts, return false and do not add it; otherwise,
     * add it and return true.
     * @param account
     * @return true if successful
     */
    public boolean add(Account account) {
        if (hasAccountNumber (account.getNumber())== true || Acco.length == numAccounts){
        return false;
    }
    else {
            Acco[numAccounts] = account; 
            numAccounts = numAccounts + 1; 
            return true;  
        }
    }

    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        String s = getName() + ": " + getNumAccounts() +
                " of " + getAccounts().length +
                " accounts open";
        for(Account acc : getAccounts()) {
            if (acc == null) break;
            s += "\n  " + acc;
        }
        return s;
    }

}
