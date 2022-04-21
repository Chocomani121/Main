public class Main {

    public static void main(String[] args) {
        // Activity 1
        Cars car = new Cars("RS-1", "Corolla", "Toyota", "2022", "Manila City", "Quezon City");

        System.out.println("Model " + car.getModel() + car.getBrand() + car.getYear());

        System.out.println("Current Location: " + car.getLocation());
        System.out.println("Travel Location: " + car.getTravel());

        // Activity 2
        Cars car2[] = new Cars[] {
                new Cars("Mazda-", "Rx-7", "Mazda", "2022", "Manila City", "Quezon City"),
                new Cars("Subaru-", "Impreza", "Subaru", "2022", "Cebu City", "Mandaue City"),
                new Cars("Mitsubishi-", "Lancer", "Mitsubishi", "2022", "Davao City", "Sarangani City")
        };
        System.out.println();

        for (Cars eachCar : car2) {

            System.out.println("Car Name: " + eachCar.getName() + eachCar.getModel());
            System.out.println("Current Location:" + eachCar.getLocation()); // for loops for each if else
            System.out.println("Travel Location:" + eachCar.getTravel());
            System.out.println();
        }
    }
}