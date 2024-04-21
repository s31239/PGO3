import java.time.LocalDate;
import java.util.ArrayList;

class Manager extends Employee {
    private final ArrayList<Goal> goals;

    public Manager(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.goals = new ArrayList<>();
    }

    public void addGoals(Goal goal) {
        goals.add(goal);
    }

    @Override
    int calculateSalary() {
        int baseSalary = 3000;
        int yearsOfExperience = LocalDate.now().getYear() - getYearOfEmployment();
        int experienceBonus = yearsOfExperience * 1000;

        for (Goal goal : goals) {
            if (goal.isAchieved()) {
                experienceBonus += goal.getBonus();
            }
        }

        return baseSalary + experienceBonus;
    }
}
