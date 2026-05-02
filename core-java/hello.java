import java.util.*; 
class hello{
    public static void main(String[] args) {
        int a=10;

        System.out.println(Integer.toString(a));

        String s="10";
        System.out.println(s);

        System.out.println(Integer.parseInt(s));

        List<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add("hello");
        arr.add(3.14);

        System.out.print(arr);

        Map <String,Object>map = new HashMap<>();

        map.put("name","pratham");
        map.put("age",21);
        map.put("isStudent",true);

        System.out.println(map.get("name"));

    }

}