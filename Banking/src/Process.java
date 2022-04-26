import java.util.InputMismatchException;
import java.util.Scanner;

public class Process {
    private Design make = new Design();
    private Scanner sc = new Scanner(System.in);
    private Account personalAcc, businessAcc;

    public void createAcc() {
        personalAcc = new Personal(2500, 100, 2, "Mayk Lemuel", "Chan", "Nia Road", "Imus", "Cavite", "4104");
        businessAcc = new Business(690, 500, 10, "Jayperson", "Babaran", "Mambog", "Bacoor", "Cavite", "4103");
    }

    public void choices() {
        boolean choiceLoop = false;

        while (!choiceLoop) {
            make.printBox("BANK SYSTEM");
            System.out.print("[1] - View Account \n[2] - Withdraw \n[3] - Deposit \n[4] - Exit \n\nChoose: ");

            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        viewAcc();
                        break;
                    case 2:
                        whichAccount();
                        break;
                    case 3:
                        whichAccount2();
                        break;
                    case 4:
                        System.out.print("Thank you have a nice day!");
                        make.enterToContinue();
                        choiceLoop = true;
                        break;
                    default:
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("INVALID CHOICE! Please try again.");
                sc.next();
                make.enterToContinue();
            }
        }
    }

    public void viewAcc() {
        make.printBox("PERSONAL ACCOUNT");
        System.out.println(personalAcc);
        make.printBox("BUSINESS ACCOUNT");
        System.out.println(businessAcc);
        make.enterToContinue();
    }

    public void whichAccount() {
        make.clearConsole();
        boolean withLoop = false;

        while (!withLoop) {
            make.printBox("WITHDRAW");
            System.out.print("Which Acc? \n[P] - Personal \n[B] - Business \n[E] - Back\n\nChoose: ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("P")) {
                withdraw(personalAcc, "PERSONAL");
                withLoop = true;
            } else if (choice.equalsIgnoreCase("B")) {
                withdraw(businessAcc, "BUSINESS");
                withLoop = true;
            } else if (choice.equalsIgnoreCase("E")) {
                make.clearConsole();
                withLoop = true;
            } else {
                System.out.println("Invalid Choice! ");
                make.enterToContinue();
            }
        }
    }

    public void whichAccount2() {
        make.clearConsole();
        boolean depLoop = false;

        while (!depLoop) {
            make.printBox("DEPOSIT");
            System.out.print("Which Acc? \n[P] - Personal \n[B] - Business \n[E] - Back\n\nChoose: ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("P")) {
                deposit(personalAcc, "PERSONAL");
                depLoop = true;
            } else if (choice.equalsIgnoreCase("B")) {
                deposit(businessAcc, "BUSINESS");
                depLoop = true;
            } else if (choice.equalsIgnoreCase("E")) {
                make.clearConsole();
                depLoop = true;
            } else {
                System.out.println("Invalid Choice! ");
                make.enterToContinue();
            }
        }
    }

    public void withdraw(Account acc, String chosen) {
        make.clearConsole();
        make.printBox("WITHDRAW - " + chosen + " ACCOUNT");
        System.out.println(acc);
        System.out.print("\nEnter amount to withdraw: ");

        try {
            double amount = sc.nextDouble();
            if (amount <= 0) {
                System.out.println("You cannot withdraw zero/negative amount!");
            } else {
                acc.withdrawal(amount);
            }
        } catch (InputMismatchException e) {
            System.out.println("This is not a number!");
            sc.next();
        }
        make.enterToContinue();
    }

    public void deposit(Account acc, String chosen) {
        make.clearConsole();
        make.printBox("DEPOSIT - " + chosen + " ACCOUNT");
        System.out.println(acc);
        System.out.print("\nEnter amount to deposit: ");

        try {
            double amount = sc.nextDouble();
            if (amount <= 0) {
                System.out.println("You cannot deposit zero/negative amount!");
            } else {
                acc.deposit(amount);
            }
        } catch (InputMismatchException e) {
            System.out.println("This is not a number!");
            sc.next();
        }
        make.enterToContinue();
    }

    public void mainMenu() {
        createAcc();
        choices();
    }
}
