package bitcamp.java100.ch08.ex2;

public class Test2 {
    public static void main(String[] args) {

        Car c;  
        c = new Car(); 

        c = new Truck();
        c = new Sedan();

        c.model = "티코";
        c.capacity = 4;
        c.engineType = 1;
        c.cylinder = 4;
        c.valve = 16;
        
       
    }
}
