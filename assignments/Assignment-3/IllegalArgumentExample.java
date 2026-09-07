public class IllegalArgumentExample {
    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
    public static void main(String[] args) {
        setAge(-5);
    }
}
