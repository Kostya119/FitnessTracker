public class FitnessTracker {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private int weight;
    private int bloodPressure;
    private int stepsPerDay;
    private int age;

    public FitnessTracker(String firstName, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, String phone) {
        this.firstName = firstName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.age = 2020 - yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: " + lastName);
        System.out.println("Date of Birth: " + dayOfBirth + "." + monthOfBirth + "." + yearOfBirth);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phone);
        System.out.println("Weight: " + weight);
        System.out.println("Pressure: " + bloodPressure);
        System.out.println("Number of steps per day: " + stepsPerDay);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }
}