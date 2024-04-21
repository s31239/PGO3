import java.time.LocalDate;

class Goal {
    private int year;
    private int month;
    private int day;
    private String description;
    private int bonus;

    public Goal(int year, int month, int day, String description, int bonus) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.description = description;
        this.bonus = bonus;
    }

    public boolean isAchieved() {
        LocalDate goalDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        return goalDate.isBefore(currentDate) || goalDate.isEqual(currentDate);
    }

    public String getDescription() {
        return description;
    }

    public int getBonus() {
        return bonus;
    }
}
