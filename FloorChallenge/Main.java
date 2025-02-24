public class Main {
public static void main(String[] args) {

        Floor floor = new Floor(45.5,50.6);
        Carpet carpet = new Carpet(78.5);


        double area = floor.getArea();
        double cost = carpet.getCost();



        System.out.println(floor.getArea());
        System.out.println(carpet.getCost());
        System.out.println(area * cost);



    }


}
