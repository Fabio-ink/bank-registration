// entities/BankAccount.java
package entities;

public class BankAccount {

    private final int idAccount;
    private String accountHolder;
    private Double balance;

    public BankAccount(int idAccount, String accountHolder, Double balance) {
        this.idAccount = idAccount;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public BankAccount(int idAccount, String accountHolder) {
        this.idAccount = idAccount;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double value){
        this.balance += value;
    }

    public void withdraw(Double value){
        this.balance -= (value + 5.0); // taxa de 5
    }

    @Override
    public String toString(){
        return "Número da conta: " + idAccount + ", Titular: " + accountHolder + ", Saldo: R$" + String.format("%.2f", balance);
    }
}
