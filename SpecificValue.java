package basic;

public class SpecificValue {

	public static void main(String[] args) {
		int a[] = { 23, 89, 45, 12, 34, 72 };
		int key = 3;
		boolean found = false;
		for (int i = 0; i < a.length; i++) {
			if (key == a[i]) {
				System.out.println("Element is found" + a[i]);
				found=true;
				break;
				
			} 
		}
		 if (!found) {
	            System.out.println("Element " + key + " is not found in the array.");
	        }
		}
    }

