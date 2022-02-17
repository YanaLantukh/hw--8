package myHashMap;

public class TestMyHashMap {
    public static void main(String[] args) {

        MyHashMap<String, String> myHashMap = new MyHashMap<>();

        for (int i = 0; i < 20; i++) {
            myHashMap.put("Key " + i, "Value " + i);
        }

        System.out.println("myHashMap.size() = " + myHashMap.size());
        System.out.println("myHashMap.get(\"Key 10\") = " + myHashMap.get("Key 10"));
        System.out.println("myHashMap.remove(Key 10)");
        myHashMap.remove("Key 10" );
        System.out.println("myHashMap.size() = " + myHashMap.size());
        System.out.println("myHashMap.clear");
        myHashMap.clear();
        System.out.println("myHashMap.size() = " + myHashMap.size());
    }
}
