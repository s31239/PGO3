abstract class Employee {
    private  String firstName;
    private  String lastName;
    private  String address;
    private  String email;
    private  String pesel;
    private final int yearOfEmployment;

    public Employee(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.yearOfEmployment = yearOfEmployment;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPesel() {
        return pesel;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    // Abstrakcyjna metoda do obliczania pensji
    abstract int calculateSalary();
}
