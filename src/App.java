import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class App {

    public static void menu() {
        System.out.println("Main menu:");
        System.out.println("1: check balance: ");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
        System.out.println("Enter a choice: ");
    }

    public static void main(String[] args) {

        //Tạo 10 account
        Account account0 = new Account(0, 100);
        Account account1 = new Account(1, 100);
        Account account2 = new Account(2, 100);
        Account account3 = new Account(3, 100);
        Account account4 = new Account(4, 100);
        Account account5 = new Account(5, 100);
        Account account6 = new Account(6, 100);
        Account account7 = new Account(7, 100);
        Account account8 = new Account(8, 100);
        Account account9 = new Account(9, 100);

        //Add 10 account vào list
        ArrayList<Account> list = new ArrayList<>();
        list.add(account0);
        list.add(account1);
        list.add(account2);
        list.add(account3);
        list.add(account4);
        list.add(account5);
        list.add(account6);
        list.add(account7);
        list.add(account8);
        list.add(account9);
        Scanner scanner = new Scanner(System.in);
        int id;
        do {
            System.out.println("Enter a id: ");
            id = scanner.nextInt();
        } while (id < 0 || id > 9);

        int choice;

        menu();
        while (true) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Balance: " + list.get(id).getBalance());
                    menu();
                    break;
                case 2:
                    System.out.println("Enter a withdrawalMoney");
                    double withdrawalMoney = scanner.nextDouble();
                    list.get(id).withDraw(withdrawalMoney);
                    menu();
                    break;
                case 3:
                    System.out.println("Enter a deposit");
                    double deposits = scanner.nextDouble();
                    list.get(id).depositMoney(deposits);
                    menu();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}