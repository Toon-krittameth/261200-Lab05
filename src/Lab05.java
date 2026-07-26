import java.time.LocalDate;

public class Lab05 {
    public static void main(String[] args) {
        git status
        User john = new User("John", 1954, 2, 18);
        System.out.println(john.getInfo());

        User peter = new User("peter", 2029,3,16);
        System.out.println(peter.getInfo());

        Admin nicolas = new Admin("Nicolas", 1964, 1, 7);
        System.out.println(nicolas.getInfo());

        System.out.println(nicolas.getInfo(true));
        System.out.println(nicolas.getInfo(false));

        // --- Demonstrate isBirthday() / getBirthdayGreeting() ---
        LocalDate today = LocalDate.now();

        User birthdayUser = new User("Sarah", today.getYear() - 25,
                today.getMonthValue(), today.getDayOfMonth());
        Admin birthdayAdmin = new Admin("Marco", today.getYear() - 62,
                today.getMonthValue(), today.getDayOfMonth());

        System.out.println(birthdayUser.getBirthdayGreeting());
        System.out.println(birthdayAdmin.getBirthdayGreeting());
    }
}