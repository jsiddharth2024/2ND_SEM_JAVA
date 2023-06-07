class Complex
{
    double real, img;
    
    Complex(double r, double i){
        this.real = r;
        this.img = i;
    }
    
    public static Complex sum(Complex c1, Complex c2){
        Complex temp = new Complex(0, 0);    
        temp.real = c1.real + c2.real;
        temp.img =c1.img + c2.img;
        return temp;
    }
    
    public static void main(String args[]){
        System.out.println("J SIDDHARTH");
                System.out.println("SJC22MCA-2034");
        System.out.println("04-04-2023");
        System.out.println("20MCA132 , Object Oriented Programming Lab \n");

        Complex c1 = new Complex(5.5, 4);
        Complex c2 = new Complex(1.2, 3.5);
        Complex temp = sum(c1, c2);
        
        System.out.println("Sum is :" + temp.real+" + "+ temp.img + "i");
    }
     
}
