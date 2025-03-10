public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        
        
        car.setMake("Porsche");
        System.out.println("make = " + car.getMake());
        car.describeCar();
 
        Car tar = new Car();
        tar.setMake("tesla");
        tar.setModel("Targa");
        tar.describeCar();
    }
}