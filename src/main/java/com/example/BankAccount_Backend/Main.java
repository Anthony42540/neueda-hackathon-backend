public class Main {

    public static void main(String[] args) {

        BankAccount check = new CheckingAccount(500, "ThisIsOneID");

        Client joey = new Client("Joey",123456789,"01/01/2000",check);

        BankAccount save = new SavingsAccount(1000, "NewAccount");

        joey.addAccount(save);

        System.out.println(joey);
    }

}
