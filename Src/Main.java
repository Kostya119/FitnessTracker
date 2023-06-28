public class Main {
    public static void main(String[] args) {

        FitnessTracker user1 = new FitnessTracker(
                "Maria", 10, 5, 1990, "Maria@gmail.com", "0739745321");
        FitnessTracker user2 = new FitnessTracker(
                "Pavel", 15, 3, 1985, "Pavel@gmail.com", "0983265794");
        FitnessTracker user3 = new FitnessTracker(
                "Ivan", 20, 7, 2000, "Ivan@gmail.com", "0934545670");

        user1.setLastName("Shpits");
        user1.setWeight(70);
        user1.setBloodPressure(120);
        user1.setStepsPerDay(10000);

        user2.setLastName("Koval");
        user2.setWeight(80);
        user2.setBloodPressure(130);
        user2.setStepsPerDay(8000);

        user3.setLastName("Ivanov");
        user3.setWeight(80);
        user3.setBloodPressure(130);
        user3.setStepsPerDay(8000);

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
    }
}