public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge",
                400);
        doAnimalStuff(animal,"slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");

        Dog labrador = new Dog("Labrador",30);
        doAnimalStuff(labrador,"fast");
        Dog retriever = new Dog("Retriever", 70,
                
                "Floppy","Pony");
        doAnimalStuff(retriever,"slow");

        Fish goldy = new Fish("Goldfish", 0.25,
                2, 4);
        
        
        doAnimalStuff(goldy,"fast");

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        
        
        
        
        
        
        
        
        
        

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("------");


    }
}
