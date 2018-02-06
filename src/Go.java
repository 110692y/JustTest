public class Go {
    public static void main(String[] args) {
        Porshe911 porshe911 = new Porshe911(3, "Green",300 );
        Truck firstTruck = new Truck(5,"Black");

        System.out.println("*Вывод toString of Porshe911:"+ porshe911);
        System.out.println("*Вывод ride() of Porshe911:");
        porshe911.ride();

        System.out.println("*Вывод toString of Truck:" + firstTruck);
        System.out.println("*Вывод ride() of Truck:");
        firstTruck.ride();
    }
}
