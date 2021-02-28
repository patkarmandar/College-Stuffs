package simplebankdemo;

class Account extends Bank {

    void balance() {
        System.out.print("Balance : " + amount);
    }

    void deposit() {
        double depAmt = 0;

        System.out.print("Enter Amount : ");
        depAmt = input.nextInt();

        System.out.print(depAmt + " Rs deposited succesfully.");
        amount = amount + depAmt;
    }

    boolean withdraw() {
        int pin, amt = 0;

        System.out.print("Enter ATM Pin : ");
        pin = input.nextInt();

        if (pin == atmPin) {
            System.out.print("Enter Amount : ");
            amt = input.nextInt();
            if (amt == 0) {
                System.out.print("\nEnter amount greater than zero");
            } else if (amt <= amount) {
                System.out.print(amt + " Rs withdrawed.");
                amount = amount - amt;
            } else {
                System.out.print("\nInsufficient Balance!");
            }
        } else if (pin == revPin) {
            System.out.print("ATM Blocked");
            return false;
        } else {
            System.out.print("\nIncorrect Pin!");
        }

        return true;
    }
}
