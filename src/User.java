import java.time.LocalDate;
public class User {
    protected String name;
    protected  LocalDate dob;

    public String getName() { return name; }
    public void  setName(String name) { this.name = name; }
    public LocalDate getDob() { return dob; }

    public void setDob(int year, int month, int date) {
        LocalDate inputDate = LocalDate.of(year, month, date);

        if (inputDate.isAfter(LocalDate.now())) {
            this.dob = LocalDate.now();
        }else{
            this.dob = inputDate;
        }
    }
    public User() {
        this.name = "Unknown";
        this.dob = LocalDate.now();
    }
    public User(String name, int year, int month, int date){
        this.setName(name);
        this.setDob(year, month, date);
    }

    public String getInfo(){
        return "Name: " + name + ", DOB: " + dob;
    }

    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return today.getMonthValue() == dob.getMonthValue()
                && today.getDayOfMonth() == dob.getDayOfMonth();
    }

    public String getBirthdayGreeting() {
        if (isBirthday()) {
            return "Happy birthday " + name + "!";
        } else {
            return "It is not " + name + "'s birthday today.";
        }
    }
}