import java.time.LocalDate;
import java.util.ArrayList;

class Tester extends Employee {
    private ArrayList<String> testTypes;

    public Tester(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.testTypes = new ArrayList<>();
    }

    public void addTestType(String testType) {
        testTypes.add(testType);
    }

    @Override
    int calculateSalary() {
        int baseSalary = 3000;
        int yearsOfExperience = LocalDate.now().getYear() - getYearOfEmployment();
        int experienceBonus = yearsOfExperience * 1000;

        for (String testType : testTypes) {
            if (testType.equals("UI/UX")) {
                experienceBonus += 300;
            }
        }

        return baseSalary + experienceBonus;
    }
}
