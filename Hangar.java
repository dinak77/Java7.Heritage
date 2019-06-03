public class Hangar {

    public static void main(String[] args) {


        Car Clio = new Car("Clio", 2300000);
        Boat Titanic = new Boat("Titanic", 654520000);

        System.out.println(Clio.doStuff());
        System.out.println(Titanic.doStuff());
    }
}
