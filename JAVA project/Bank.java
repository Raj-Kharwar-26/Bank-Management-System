import java.util.Scanner;

class rough {
	private String name;
	private String address;
	private String acc_type;
	private float balance;

	rough() {
		name = " ";
		address = " ";
		acc_type = " ";
		balance = 0;
	}

	Scanner sc = new Scanner(System.in);

	void open_account() {
		System.out.print("Enter your full name: ");
		name = sc.nextLine();
		System.out.print("Enter your address: ");
		address = sc.nextLine();
		System.out.print("What type of account you want to open saving(S) or Current(C): ");
		acc_type = sc.next();
		int max = 9;
		int min = 0;
		int range = max - min + 1;
		int[] acc_num;
		acc_num=new int[14];
		System.out.println("Your account number is: ");
		for (int i = 0; i < 14; i++) {
			int rand = (int) (Math.random() * range) + min;
			acc_num[i] = rand;
		}
		System.out.println("Account Created Successfully");
		System.out.println("Your account no. is:");
		for (int i = 0; i < acc_num.length; i++) {
			System.out.print(acc_num[i]);
		}
		System.out.println();
	}

	void deposit_money() {
		float Amount = 0.F;
		System.out.println("Enter how much money you want to deposit: ");
		balance = sc.nextFloat();
		balance = balance + Amount;
		System.out.println("Available Balance: " + balance);
	}

	void display_account() {
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Type: " + acc_type);
		System.out.println("Balance: " + balance);
	}

	void withdraw_money() {
		float amount = 0.F;
		System.out.println("Enter how much money you want to withdraw: ");
		balance = sc.nextFloat();
		balance -= amount;
		System.out.println("Available balance: " + balance);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		rough customer = new rough();
		int a;
		System.out.println("Enter your choices:1)Open Account 2)Deposit money 3)Withdraw Money 4)Account Statement");
		a = sc.nextInt();
		switch (a) {
			case 1:
				System.out.println("Open account");
				customer.open_account();
				System.out.println("\n-------------------------------------------------");
				break;
			case 2:
				System.out.println("Deposit account");
				customer.deposit_money();
				System.out.println("\n-------------------------------------------------");
				break;
			case 3:
				System.out.println("Withdraw money");
				customer.withdraw_money();
				System.out.println("\n-------------------------------------------------");
				break;
			case 4:
				System.out.println("Display Account");
				customer.display_account();
				System.out.println("\n-------------------------------------------------");
				break;
			default:
				System.out.println("You have entered the wrong choice");
				System.out.println("Please enter the correct choice");
				a=sc.nextInt();
				break;
		}
	}
}
