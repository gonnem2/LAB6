import java.util.*;

public class MyShop {
    private LinkedHashMap<String, Integer> soldItems = new LinkedHashMap<>(16);
    HashMap<String, Integer> cost = new HashMap<>(16);
    public MyShop(){
        cost.put("Хлеб", 100);
        cost.put("Бумага", 120);
        cost.put("Арбуз", 150);
        cost.put("Ноутбук", 160);
        cost.put("Пылесос", 180);
    }
    public void setSoldItems(String title, int count){
        soldItems.put(title, count);
    }

    public String getSoldItems(){
        List<Map.Entry<String, Integer>> list = new ArrayList<>(soldItems.entrySet());
        return list.toString();
    }

    public int getSum(){
        int sum = 0;
        for (Map.Entry<String, Integer> i: soldItems.entrySet()){
            sum += i.getValue() * cost.get(i.getKey());
        }
        return sum;
    }


    public String  mostPopular(){
        List<Map.Entry<String, Integer>> list = new ArrayList<>(soldItems.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        return list.get(0).toString().split("=")[0] ;
    }

}
