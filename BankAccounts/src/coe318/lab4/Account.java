package coe318.lab4;
/** 
 *Muhammad Ozair     500763463
 *Section: 071
 */
public class Account{
    String AccounName; 
    int AccounNum; 
    double AccounBalance; 
    
    public Account (String name, int number, double initialBalance){
     AccounName = name; 
     AccounNum = number; 
     AccounBalance = initialBalance;
    }
    public String getName(){
        return AccounName;       
    }
    public double getBalance(){
        return AccounBalance; 
    }
    public int getNumber(){
        return AccounNum; 
    }
    public boolean deposit (double amount){
        if (amount > 0){
            AccounBalance = AccounBalance + amount; 
            return true;
        }
        else {
            return false;
        }
    }
    public boolean withdraw (double amount){
        if ((amount <= AccounBalance) &&(amount >= 0)){
            AccounBalance = AccounBalance - amount; 
            return true;
        }
        else {
            return false; 
        }
    }
    @Override
public String toString() {//DO NOT MODIFY
return "(" + getName() + ", " + getNumber() + ", " +
String.format("$%.2f", getBalance()) + ")";
}
}

