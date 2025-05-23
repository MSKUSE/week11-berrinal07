import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Zeynep");

        System.out.println(names);

        HashMap<String, Double> grades = new HashMap<>();

        grades.put("Ali", 85.5);
        grades.put("Zeynep", 92.0);
        grades.put("Mehmet", 76.3);

        System.out.println(grades);

        grades.put("Ali", 90.0);  // Ali'nin notu güncellendi

        System.out.println(grades);
    }
}