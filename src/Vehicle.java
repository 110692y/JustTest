public abstract class Vehicle implements Ride {
    protected int weight;
    protected String color;

    public Vehicle(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public String toString() {
    return "I'm Vehicle. ";
    }

    public abstract void ride();

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public static void main(String[] args) {

    }
}
