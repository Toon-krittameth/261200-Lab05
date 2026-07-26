public class Lab05 {
    public static void main(String[] args) {

        // ---- Part 1: ทดสอบ User ----
        User john = new User("John", 1954, 2, 18);
        System.out.println(john.getInfo());

        // ---- Part 2: ทดสอบ Admin (สืบทอดจาก User) ----
        Admin nicolas = new Admin("Nicolas", 1964, 1, 7);
        System.out.println(nicolas.getInfo());

        // ---- Part 3: ทดสอบ Override และ Overload ----
        System.out.println(nicolas.getInfo(true));
        System.out.println(nicolas.getInfo(false));
    }
}