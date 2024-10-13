import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TopWords{
    public static void main(String[] args) {
        String filePath = "/Users/andrejkamenskij/IdeaProjects/Lab6/file.txt";
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);
            Map<String, Integer> words = new HashMap<String, Integer>();
            while (scanner.hasNext()){
                String a = scanner.next();
                words.put(a, words.getOrDefault(a, 0) + 1);
            }

            scanner.close();
            List<Map.Entry<String, Integer>> list = new ArrayList<>(words.entrySet());
            list.sort(new Comparator<Map.Entry<String, Integer>>(){
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }});
            for (int i = 0; i <= Math.min(10, list.size()); i++){
                System.out.println(list.get(i));
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
}
}