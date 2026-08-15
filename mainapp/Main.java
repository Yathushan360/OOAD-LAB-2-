package mainapp;
import models.*;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        Student var1 = new Student("IT25102785", "Yathushan J");
        Course var2 = new Course("SE2031", "Object Oriented Analysis and Design");
        System.out.println(var1);
        System.out.println(var2);
    }
}