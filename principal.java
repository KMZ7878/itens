package kaue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Products> productList = new ArrayList<>();

		Products product = new Products();

		while (true) {
            System.out.println("Choose an option:");
            System.out.println("1 - Consult an item");
            System.out.println("2 - Create an item");
            System.out.println("3 - Remove an item");
            System.out.println("4 - Exit");
		int choise = sc.nextInt();
		sc.nextLine();

		switch (choise) {
		case 1:
			System.out.println("Enter the name of the item you want to consult:");
			String nameToConsult = sc.nextLine();
			Products productToConsult = null;
			for (Products p : productList) {
				if (p.name.equals(nameToConsult)) {
					productToConsult = p;
					break;
				}
			}
			if (productToConsult != null) {
				System.out.println("Product found: " + productToConsult);
			} else {
				System.out.println("Product not found.");
			}
			break;
			
		case 2:
			System.out.println("name: ");
			product.name = sc.nextLine();
			System.out.print("price");
			product.price = sc.nextDouble();
			System.out.println("Quantity in stock: ");
			product.quantity = sc.nextInt();
			productList.add(product);

			System.out.println(product);
			break;
		case 3:
            System.out.println("Enter the name of the item you want to remove:");
            String nameToRemove = sc.nextLine();
            Products productToRemove = null;
            for (Products p : productList) {
                if (p.name.equals(nameToRemove)) {
                    productToRemove = p;
                    break;
                }
            }
            if (productToRemove != null) {
                productList.remove(productToRemove);
                System.out.println("Product removed: " + productToRemove);
            } else {
                System.out.println("Product not found.");
            }
            break;
		case 4:
			sc.close();
            return;
        default:
            System.out.println("Invalid choice.");
            break;
				}
			}

		}

		
	}


