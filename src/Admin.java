import java.time.LocalDate;

public class Admin extends User {

    public Admin() {
        super();
    }

    public Admin(String name, int year, int month, int date) {
        super(name, year, month, date);
    }

    @Override
    public String getInfo() {
        String baseInfo = super.getInfo();
        return baseInfo + " | User type: admin";
    }


    public String getInfo(boolean full) {
        if (full) {
            return getInfo() + " | Today: " + LocalDate.now();
        } else {
            return "Name: " + name;
        }
    }

    public int getAge() {
        return LocalDate.now().getYear() - dob.getYear();
    }

    @Override
    public String getBirthdayGreeting() {
        String baseMessage = super.getBirthdayGreeting();
        if (isBirthday()) {
            return baseMessage + " You are " + getAge() + " years old!";
        } else {
            return baseMessage;
        }
    }
}