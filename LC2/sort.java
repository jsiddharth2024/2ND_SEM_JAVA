import java.util.Scanner;
import java.util.Arrays;

public class sort{
    public static void main(String[] args) {
        System.out.println("J SIDDHARTH");
        System.out.println("SJC22MCA-2034");
        System.out.println("24-03-2023");
        System.out.println("20MCA132, Object Oriented Programming Lab\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words:");
        int num = sc.nextInt();
        String[] words = new String[num];
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println("Enter a word:");
            words[i] = sc.nextLine();
        }

        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println("Sorted strings using compareTo function: " + Arrays.toString(words));
    }
}

