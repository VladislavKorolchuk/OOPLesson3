
public class Main {
    public static void main(String[] args) {

        Car carLadaGranta = new Car("Lada", "", 1999, "Россия", "белый", 150, 1.5, "МКПП", "седан", "B045AA198", 5, true);
        System.out.println(carLadaGranta.toString() + " \nИнформация о заправке: " + carLadaGranta.refill() + "\n");

        Train swallow = new Train("Ласточка", "B-901", 2011, "Россия", null, 301, 3500.0, null, "Белорусский вокзал", "Минск-Пассажирский", 11);
        System.out.println(swallow.toString() + " \nИнформация о заправке: " + swallow.refill() + "\n");

        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", null, 270, 1700.0, null, "Ленинградский вокзала", "Ленинград-Пассажирский", 8);
        System.out.println(leningrad.toString() + " \nИнформация о заправке: " + leningrad.refill() + "\n");

        Bus ikarus = new Bus("Икарус", "250", 1900, "", "красный", 100);
        System.out.println(ikarus.toString() + " \nИнформация о заправке: " + ikarus.refill() + "\n");

    }
}