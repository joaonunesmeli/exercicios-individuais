package bootcamp.java.mod5.aula4.tm.exerc2;

public class Account {
    private double balance;

    public Account() {
        this.balance = 0.0;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public Account(Account b) {
        this.balance = b.balance;
    }

    public void deposit(double v) throws Exception {
        validateValue(v);
        this.balance += v;
    }

    public void withdraw(double v) throws Exception {
        validateValue(v);
        if (v > balance) {
            throw new Exception("Não é possível sacar um valor maior que o saldo");
        }
        this.balance -= v;
    }

    public void refund(double v) throws Exception {
        deposit(v);
    }

    public void transfer(Account to, double v) throws Exception {
        validateValue(v);
        withdraw(v);
        to.deposit(v);
    }

    private void validateValue(double v) throws Exception {
        if (v <= 0.0) {
            throw new Exception("O valor fornecido deve ser maior que zero");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
