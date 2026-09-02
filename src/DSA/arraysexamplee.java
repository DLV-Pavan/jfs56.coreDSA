package DSA;

public class arraysexamplee {
	public static void main(String[] args) {
		int arr[];
		
		System.out.println("array declaration");
		
		
		int arr1[] = new int[5];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
	    arr1[3] = 40;
	    
	    System.out.println("array intilization");
	    System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        
        int[] b = {40, 50, 60};

        System.out.println("3. Direct Initialization");
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        // 4. Array Indexing Initialization
        int[] c = new int[3];

        c[0] = 70;
        c[1] = 80;
        c[2] = 90;

        System.out.println("4. Array Indexing Initialization");
        System.out.println("Index 0 = " + c[0]);
        System.out.println("Index 1 = " + c[1]);
        System.out.println("Index 2 = " + c[2]);

        // 5. Array Traversal
        System.out.println("5. Array Traversal");

        for (int i = 0; i < c.length; i++) {
            System.out.println("Index = " + i + " Value = " + c[i]);
        }
    }

		
		
}