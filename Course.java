public class Course {
    private String code;
    private String title;

    public Course(String var1, String var2) {
        this.code = var1;
        this.title = var2;
    }

    public String getCode() {
        return this.code;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "Course Code: " + this.code + ", Title: " + this.title;
    }
}