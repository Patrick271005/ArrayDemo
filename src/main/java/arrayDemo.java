import java.util.Scanner;
public class arrayDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice=sc.nextInt();
        int[] myNumbers = new int[11];
        myNumbers[0] = 100;
        myNumbers[1] = 200;
        myNumbers[2] = 300;
        myNumbers[3] = 400;
        myNumbers[4] = 500;
        myNumbers[5] = 600;
        myNumbers[6] = 700;
        myNumbers[7] = 800;
        myNumbers[8] = 900;
        myNumbers[9] = 1000;
        myNumbers[10] = choice;

        System.out.println("Please choose a number for index 10");


        System.out.println("Element at index 0:"+myNumbers[0]);
        System.out.println("Element at index 1:"+myNumbers[1]);
        System.out.println("Element at index 2:"+myNumbers[2]);
        System.out.println("Element at index 3:"+myNumbers[3]);
        System.out.println("Element at index 4:"+myNumbers[4]);
        System.out.println("Element at index 5:"+myNumbers[5]);
        System.out.println("Element at index 6:"+myNumbers[6]);
        System.out.println("Element at index 7:"+myNumbers[7]);
        System.out.println("Element at index 8:"+myNumbers[8]);
        System.out.println("Element at index 9:"+myNumbers[9]);
        System.out.println("Element at index 10:"+myNumbers[choice]);

    }
}
