package güneşbank;

public class Current extends Account  {
    public Current(){
       super();
   }
   
   public Current(int customerID,int password,int balance){
   super(customerID,password,balance);
   }

 

   @Override
   public int Deposit(int pcash){
     
      int balance= this.getBalance() + pcash;
       return balance;
     
   }

   @Override
   public int Withdraw(int mcash){
     
       int balance = this.getBalance() - mcash;
       return balance;
      
   }
   
   @Override
   public double Benefit() {
       return 0;
   }

}
