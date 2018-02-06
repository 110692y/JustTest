public abstract class RaceCar extends Vehicle {

    protected int speed;

    protected RaceCar(int weight, String color, int speed) {
        super(weight, color);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void ride() {
        System.out.println("I ride too fast");
    }
    public String toString() {
        return super.toString() + "RaceCar.";
    }
}
