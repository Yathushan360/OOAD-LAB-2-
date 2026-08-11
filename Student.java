public class Student {
    private String id;
    private String name;

    public Student(String var1, String var2) {
        this.id = var1;
        this.name = var2;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Student ID: " + this.id + ", Name: " + this.name;
    }
}