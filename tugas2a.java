
public class tugas2 {

public static void main(String[] args) {
    
    BankAccount user = new BankAccount();
    
    user.setAccountNumber(1);
    user.setbalance(52000);
    user.setcustomerName("John Doe");
    user.setcustomerEmail("johndoe@email.com");
    user.setcustomerPhone("+62123456789;");

    System.out.println("Account Number: "+user.getAccountNumber());
    System.out.println("Account Number: "+user.getbalance());
    System.out.println("Account Number: "+user.getcustomerName());
    System.out.println("Account Number: "+user.getcustomerEmail());
    System.out.println("Account Number: "+user.getcustomerPhone());

    System.out.println(user.deposit(100));
    System.out.println(user.withdraw(50));
    System.out.println(user.withdraw(999999999));

}

    

}

/**
 * Innertugas2
 */
class BankAccount {

    private int accountNumber, balance;
    private String customerName, customerEmail, customerPhone;

    public BankAccount() {
        accountNumber = 0;
        balance = 0;
        customerName = "John Doe";
        customerEmail = "johndoe@email.com";
        customerPhone = "+62";
    }

    // Setter n Getter accnumber
    public void setAccountNumber(int accnum) {
        
        this.accountNumber = accnum;

    }

    public int getAccountNumber() {
        
        return accountNumber;

    }

    // Setter n Getter balance
    public void setbalance(int balance) {
        
        this.balance = balance;

    }

    public int getbalance() {
        
        return balance;

    }

    // Setter n Getter balance
    public void setcustomerName(String var_customerName) {
        
        this.customerName = var_customerName;

    }

    public String getcustomerName() {
        
        return customerName;

    }

    // Setter n Getter balance
    public void setcustomerEmail(String var_customerEmail) {
        
        this.customerEmail = var_customerEmail;

    }

    public String getcustomerEmail() {
        
        return customerEmail;

    }

    // Setter n Getter balance
    public void setcustomerPhone(String var_customerPhone) {
        
        this.customerPhone = var_customerPhone;

    }

    public String getcustomerPhone() {
        
        return customerPhone;

    }

    public int deposit(int dep) {
        
        this.balance += dep;

        return this.balance;
        
    }
    
    public int withdraw(int wth) {
        
        if (this.balance < wth) {
            System.out.println("Insufficient damount");
            return this.balance;
        }
        
        this.balance -= wth;
        return this.balance;

    }
    
}