import java.util.Scanner;

public class MobileShop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of mobiles: ");
		int n = sc.nextInt();
		MobilePhone[] phones = new MobilePhone[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the os version");
			String os = sc.next();
			System.out.println("Enter the ram");
			int ram = sc.nextInt();
			System.out.println("Enter the memory");
			int memory = sc.nextInt();
			System.out.println("Enter the price");
			int price = sc.nextInt();
			System.out.println("Enter the rating");
			int rating = sc.nextInt();
			phones[i] = new MobilePhone(os, ram, memory, price, rating);
		}
		System.out.println("Enter the number of mobiles: ");
		int q = sc.nextInt();
		while (q--> 0) {
			System.out.println("Enter the os version");
			String os = sc.next();
			System.out.println("Enter the ram");
			int ram = sc.nextInt();
			System.out.println("Enter the memory");
			int memory = sc.nextInt();
			System.out.println("Enter the price");
			int budget = sc.nextInt();
			int maxRating = -1;
			MobilePhone selectedPhone = null;
			for (MobilePhone phone : phones) {
				if (phone.os.equals(os) && phone.ram == ram && phone.memory == memory && phone.price <= budget) {
					if (phone.rating > maxRating) {
						maxRating = phone.rating;
						selectedPhone = phone;
					}
				}
			}
			if (selectedPhone == null) {
				System.out.println("-1");
			} else {
				System.out.println(selectedPhone.rating);
			}
		}
		sc.close();
	}
}
