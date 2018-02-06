public class Truck extends Vehicle {

    protected Truck(int weight, String color) {
        super(weight, color);
    }

    @Override
    public void ride() {
        System.out.println("I ride heavy things. ");
    }
    public String toString() {
        return super.toString() + "Truck.";
    }
}
