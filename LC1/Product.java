/*Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of
the class and find the product having the lowest price.*/
import java.util.*;
class Product{
      int pcode;
      String pname;
      double price;
      void assign(){
             Scanner s=new Scanner(System.in);
             System.out.println("\nEnter the product code");
             pcode=s.nextInt();
             System.out.println("\nEnter the product name");
             pname=s.next();
             System.out.println("\nEnter the product price");
             price=s.nextInt();
             
      }
      static void lowest(double p1, double p2, double p3){
           if(p1<p2 && p1<p3){
               System.out.println("product 1 with cost "+ p1 + "  is of the lowest price");
           }
           else if(p2<p1 && p2<p3){
               System.out.println("product 2 with cost "+ p2 + "  is of the lowest price");
           }
           else{
               System.out.println("product 3 with cost "+ p3 + "  is of the lowest price");
           }
     }  
     public static void main(String[] args){
            System.out.println("J SIDDHARTH");
            System.out.println("SJC22MCA-2034");
            System.out.println("24-03-2023");
            System.out.println("20MCA132 , Object Oriented Programming Lab \n");         
            Product obj1 = new Product();
            Product obj2 = new Product();
            Product obj3 = new Product(); 
            System.out.println("Enter the  first product details");  
            obj1.assign();
            System.out.println("Enter the  second product details");  
            obj2.assign();
            System.out.println("Enter the  third product details");  
            obj3.assign();
            lowest(obj1.price,obj2.price,obj3.price);
            }
 }                    
