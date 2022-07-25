public class Hangar {
    public static void main(String[] args) {
        Car peugeot = new Car("Peugeot");
        Boat blackPearl = new Boat("Black Pearl");

        peugeot.setKilometers(1049543);

        System.out.println(peugeot.doStuff());
        System.out.println(blackPearl.doStuff());
        System.out.println(peugeot.getKilometers());
    }
}