import java.time.LocalDate;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Tworzenie i dodawanie programistów
        Developer dev = new Developer("Jan", "Kowalski", "Warszawa", "jan.kowalski@email.pl", "123456789", 2020);
        Technology java = new Technology("Java", 800);
        dev.addTechnology(java);
        employees.add(dev);

        // Tworzenie i dodawanie testerów
        Tester tester = new Tester("Anna", "Nowak", "Kraków", "anna.nowak@email.pl", "987654321", 2021);
        tester.addTestType("UI/UX");
        employees.add(tester);

        // Tworzenie i dodawanie managera
        Manager manager = new Manager("Piotr", "Wiśniewski", "Gdańsk", "piotr.wisniewski@email.pl", "1122334455", 2019);
        Goal cel = new Goal(2024, 10, 15, "Wdrożenie logowania FB", 1000);
        manager.addGoals(cel);
        employees.add(manager);

        // Obliczanie łącznej kwoty do wypłaty
        int totalAmount = 0;
        for (Employee employee : employees) {
            totalAmount += employee.calculateSalary();
        }

        System.out.println("Łączna kwota do wypłaty w tym miesiącu: " + totalAmount + " PLN");
    }
}
