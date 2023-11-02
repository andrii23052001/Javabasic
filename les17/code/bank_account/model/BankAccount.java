package bank_account.model;

public class BankAccount {
    // сначала мы прописываем поля класса

    private long id; // номер счета УНИКАЛЬНЫЙ

    private String owner; // владелец счета..

    private String bankName;
    private int branch; // номер филиала банка

    private double balance; // текущий баланс

    // тип счета валюта - такие поля тоже полезны и необходимы
    // адрес контактные данные возраст больше 18 , паспортные данные

    // конструктор класса


    public BankAccount(long id, String owner, String bankName, int branch, double balance) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;

    }

    // конструктор без поля баланс
    public BankAccount(long id, String owner, String bankName, int branch) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        balance = 0.0;
    }

    // конструктор для анонимного  клиента (без имени)
    public BankAccount(long id, String bankName, int branch, double balance) {
        this.id = id;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
        owner = "Anonimus";
    }

    // конструктор анонимный клиент и без денег
    public BankAccount(long id, String bankName, int branch) {
        this.id = id;
        this.bankName = bankName;
        this.branch = branch;
    }

    public void display() {
        System.out.println("acc: " + id + ", owner: " + owner + ", bank: " + bankName + ", balance: " + balance);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // добавляем метод который отвечает за то что бы ПОЛОЖИТЬ ДЕНЬГИ
    public boolean deposit(double sum) {
        balance = balance + sum;
        return true;
    }


    public boolean withdraw(double sum) {
        if (sum <= balance) {
            balance = balance - sum;
            return true;
        }
        return false;
        //ВТОРОЙ МЕТОД СНЯТЬ ДЕНЬГИ СО СЧЕТА
    }
}
