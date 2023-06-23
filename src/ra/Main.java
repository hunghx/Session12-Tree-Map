package ra;

import ra.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        // thêm 1 phần tử vào map
        map.put("0987645363","Hồ Xuân Hùng 1");
        map.put("0987645362","Hồ Xuân Hùng 2");
        map.put("0987645365","Hồ Xuân Hùng 3");
        map.put("0987645368","Hồ Xuân Hùng 4");
        map.put("0987645368","Nguyễn Thế Anh");
        map.put(null,"Nguyễn Thế Anh");
        Set<String> listKey = map.keySet();
        for (String key : listKey) {
            System.out.println(" Key : "+ key + ", Value : "+map.get(key));
        }
        System.out.println(map.containsKey("098764536"));
        System.out.println(map.containsValue("Hồ Xuân Hùng 4"));
        for (String value: map.values()) {
            System.out.println(value);
        }

        // xóa phần tử theo key
        String value = map.remove(null);
        System.out.println(value);


        Node<Integer> root = new Node<>(100);
        Node<Integer> nodeleft1= new Node<>(20);
        root.left = nodeleft1;
        root.right  =new Node<>(30);
        nodeleft1.left = new Node<>(10);
        nodeleft1.right = new Node<>(25);

        /*
                            100
                          /     \
                         20     30
                        /  \
                       10   25
         */
        Map<Integer, String> bst = new TreeMap<>();
        bst.put(1, "Hùng");
        bst.put(2, "Nam");
        bst.put(4, "");
        bst.put(3, "Khánh");
        bst.put(7, null);
        bst.put(6, "Đức");
        System.out.println(bst);
    }
}