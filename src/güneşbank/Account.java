package güneşbank;

import java.time.LocalDate;

public abstract class Account {
    
    private LocalDate zaman = LocalDate.of(2023,12,22);
    protected int  balance ;
    private int customerID;
    private int password;
    
 
    
    public Account(int balance, int customerID, int password) {
        this.balance = balance;
        this.customerID = customerID;
        this.password = password;
    }
    
    
    
    public Account() {
        password=0;
        customerID = 0;
        balance = 0;
        zaman = LocalDate.of(2023, 12, 22);
    }
    
    public LocalDate getZaman() {
        return zaman;
    }

    public void setZaman(LocalDate zaman) {
        this.zaman = zaman;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password; 
        
    }



	public int Deposit(int pcash) {
		
		return 0;
	}



	public double Benefit() {
		
		return 0;
	}



	public int Withdraw(int mcash) {
		
		return 0;
	}

    
    

    
    
    
   
    
    
     
}