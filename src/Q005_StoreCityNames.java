
import java.util.ArrayList;

public class Q005_StoreCityNames {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Indore");
        cities.add("Bhopal");
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");

        System.out.println("City names in the list:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}