import java.util.Scanner;


public class tugas1 {
    public static void main(String[] args) {
        switchcase();
        looping();
        whileloop();
    }

    public static String switchcase() {
        // switch case function to check odd/even number (integer >0 only)
        System.out.println("Switch Case Function for Odd/Even Test");
        // using try so scanner util will be closed automatically after function call ends
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Insert Number: ");
            int a = sc.nextInt();
            String x;

            // switch condition to check remainder of given number
            switch (a % 2) {
                // if there is no remainder -> even number
                case 0:
                x = "Genap";
                System.out.println(x);
                return x;
                
                // if there is still a remainder -> odd number
                case 1:
                x = "Ganjil";
                System.out.println(x);
                return x;
                
                // if there is something else -> error
                default:
                    x = "Aneh";
                    System.out.println(x);
                    return x;
            }
             
        }
    }

    public static void looping() {
        String[] days = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Insert Number of Element to be Printed: ");
            int jml = sc.nextInt();
            
            // calling loopforeach function
            loopforeach(days);
            
            // calling loopxelem function
            String myarr[] = loopxelem(jml, days);

            // print all element(s) from new array
            for (String elem : myarr) {
                System.out.println(elem);
            }
        }

    }

    public static void loopforeach(String [] arr) {
        // print all elements using for each
        System.out.println("Using For Each to Print All Elements");
        for (String elem : arr) {
            System.out.println(elem);
        }
        
    }

    public static String[] loopxelem(int jml, String [] arr) {
        // print first x element(s) using manual indexing
        System.out.println("Printing only " + jml + " First Element(s) from Array");
        String[] newArr = new String[jml];
        for (int i = 0; i < jml; i++) {
            // error handling out of bound array (sometimes unnecesarry)
            if (i == arr.length) {
                break;
            }
            // System.out.println(arr[i]);

            // copying element from source array to new array 
            newArr[i] = arr[i];
         }
        
        return newArr;
        
    }

    public static void whileloop() {
        int i = 1;

        // using try so scanner util will be closed automatically after function call ends
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Insert Your Number: ");
            int myNum = sc.nextInt();
            
            System.out.println("Printing Factor of Number" + myNum);
            while (i <= myNum) {

                // unnecessary error handling
                if (i > myNum) {
                    break;
                }

                // if it is number's factor then print
                if (myNum % i == 0) {
                    System.out.println(i);
                }

                // increment
                i++;
            }
        }
    }
}
