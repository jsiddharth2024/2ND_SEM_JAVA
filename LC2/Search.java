import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        System.out.println("J SIDDHARTH");
        System.out.println("SJC22MCA-2034");
        System.out.println("27-04-2023");
        System.out.println("20MCA132 , Object Oriented Programming Lab \n"); 
        int i,j,x=0;
        boolean state = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemets in array");
        int num=sc.nextInt();
        String word[]=new String[num];
        sc.nextLine();
        for( i=0;i<num;i++){
        System.out.println("\nEnter a Word\n");
        word[i]=sc.nextLine();
        }
        System.out.println("Enter the element to Search");
        String search = sc.nextLine();
        for( i=0;i<num;i++){
            if(word[i].equals(search)){
                 x = i;
                state = true;
            }
            }
            if(state){
        System.out.println("Element found at  position = "+x);
            }
            else{
        System.out.println("Element found not found");

            }
    }
    
}
