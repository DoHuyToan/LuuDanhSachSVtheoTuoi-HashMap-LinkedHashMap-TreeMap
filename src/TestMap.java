import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        // tạo đối tượng hashMap lưu Tên SV(như là khóa key) v Tuổi theo HashMap, hiển thị ko theo thứ tự
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        // tạo đối tượng treeMap lưu key theo thứ tự giảm dần đầu chữ cái aphabet theo TreeMap: ABC...XYZ, ưu tiên viết hoa
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        // tạo đối tượng linkedHashMap để lưu danh sách tương tự HashMap và hiển thị dữ liệu theo đúng thứ tự put
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Cook", 29);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);

        System.out.println("linkedHashMap");
        System.out.println(linkedHashMap);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
