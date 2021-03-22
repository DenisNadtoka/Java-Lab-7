import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;



public class Demo {
    public static void main(String[] args) {
        int minVal = 0;
        int maxVal = 10;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            int randInt = ThreadLocalRandom.current().nextInt(minVal, maxVal);
            list.add(randInt);
        }
        System.out.print("List: ");
        System.out.println(list);

        Set<Integer> Set = new HashSet<>(list);
        System.out.print("Set: ");
        System.out.println(Set);

        Map<Integer, Integer> Map = new HashMap<>();
        for(int i: Set){
            Map.put(i, list.indexOf(i));
        }
        System.out.print("Map: ");
        System.out.print(Map);
    }
}
