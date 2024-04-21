import java.time.LocalDate;
import java.util.ArrayList;

class Developer extends Employee {
    private ArrayList<Technology> technologies;

    public Developer(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.technologies = new ArrayList<>();
    }

    public void addTechnology(Technology technology) {
        technologies.add(technology);
    }

    @Override
    int calculateSalary() {
        int baseSalary = 3000;
        int yearsOfExperience = LocalDate.now().getYear() - getYearOfEmployment();
        int experienceBonus = yearsOfExperience * 1000;

        for (Technology technology : technologies) {
            experienceBonus += technology.getBonus();
        }

        return baseSalary + experienceBonus;
    }
}