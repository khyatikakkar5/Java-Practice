public class Dog extends Animal {


    

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "small",20);
    }

    public Dog(String type, double weight) {
        this(type,weight,"Hanging","Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight <  35 ? "medium" : "large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @java.lang.Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {

        if ( type == "Labrador") {
            System.out.println("Bhaoo");
        }

        bark();
        System.out.println();

    }

    @java.lang.Override
    public void move(String speed) {
        super.move(speed);
       // System.out.println("Dogs move, walk and wag their tail");
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() {
        System.out.println("Woof");
    }

    private void run() {
        System.out.println("Dog Runs");
    }

    private void walk() {
        System.out.println("Dog Walks");
    }

    private void wagTail() {
        System.out.println("Wags Tail");
    }
}
