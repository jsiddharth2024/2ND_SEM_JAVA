class Cpu {
    int price;

    Cpu(int p) {
        this.price = p;
    }

    class Processor {
        int cores;
        String manufacture;

        Processor(int n, String m) {
            this.cores = n;
            this.manufacture = m;
        }

        void display() {
            System.out.println("No of Cores : " + this.cores);
            System.out.println("Processor manufactures : " + this.manufacture);
        }
    }

    static class Ram {
        int memory;
        String manufacture;

        Ram(int n, String m) {
            this.memory = n;
            this.manufacture = m;
        }

        void display() {
            System.out.println("Memory Size : " + this.memory);
            System.out.println("Memory manufactures : " + this.manufacture);
        }
    }

    void display() {
        System.out.println("Price of CPU : " + this.price);
    }

    public static void main(String[] args) {
         System.out.println("J SIDDHARTH");
         System.out.println("SJC22MCA-2034");
         System.out.println("24-04-2023");
         System.out.println("20MCA132 , Object Oriented Programming Lab \n");  


        Cpu intel = new Cpu(23000);
        Cpu.Processor i_processor = intel.new Processor(4, "intel");
        Cpu.Ram i_ram = new Ram(1024, "Asus");
        intel.display();
        i_processor.display();
        i_ram.display();
    }
}
