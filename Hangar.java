public class Hangar {

    public static void main(String[] args) {


        Car Clio = new Car("Clio", 2300000);
        Boat Titanic = new Boat("Titanic", 654520000);

        System.out.println("Je suis "+ Clio.getBrand()+" et je fais vroum vroum!");
        System.out.println("Je suis " + Titanic.getBrand()+" et je fais glou glou!");
    }
}
