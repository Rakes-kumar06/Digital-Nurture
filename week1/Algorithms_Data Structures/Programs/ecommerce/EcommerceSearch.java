package dsa.ecommerce;

public class EcommerceSearch {
	public static Product linearSearch(Product[] inventory, int targetId) {
		for(int i=0;i<inventory.length;i++) {
			if(inventory[i].getProductId() == targetId) {
				return inventory[i];
			}
		}
		return null;
	}
	
	public static Product binarySearch(Product[] inventory,int targetId) {
		int left = 0;
		int right = inventory.length-1;
		while(left<=right) {
			int mid = left + (right-left)/2;
			int midId = inventory[mid].getProductId();
			
			if(midId == targetId) {
				return inventory[mid];
			}
			if(midId > targetId) {
				right = mid-1;
			}
			else {
				left = mid + 1;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Product[] inventory = {
	            new Product(105, "Wireless Mouse", "Electronics"),
	            new Product(201, "Mechanical Keyboard", "Electronics"),
	            new Product(350, "Office Chair", "Furniture"),
	            new Product(408, "Coffee Maker", "Appliances"),
	            new Product(599, "Gaming Monitor", "Electronics")
	        };
		
		int targetId = 408;
		
		System.out.println("=== Linear Search ===");
		Product linearResult = linearSearch(inventory, targetId);
		System.out.println("The Product found at "+linearResult);
		
		System.out.println("\n=== Binary Search ===");
		Product binaryResult = binarySearch(inventory, targetId);
		System.out.println("The Product found at "+linearResult);
	}
}
