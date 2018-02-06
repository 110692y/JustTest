public class Porshe911 extends RaceCar {

    public Porshe911(int weight, String color, int speed) {
        super(weight, color, speed);
    }

    @Override
    public void ride() {
        super.ride();
        System.out.println("I wanna win!");
    }

    @Override
    public String toString() {
        return super.toString() + " I'm Porshe911.";
    }
}
