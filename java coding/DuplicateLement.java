import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateLement {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        String names[] = {"Java", "Python", "C", "Java", "ruby", "C", "JavaScript"};

        //1.  compare each element 0(nxn) --worst solution

        for(int i = 0; i<names.length; i++ ){
            for(int j = i+1; j<names.length; j++){
                if (names[i].equals(names[j])) {
                    System.out.println(names[i]);
                }
            }
        }

        // 2. using hashSet: Java collection: is store unique value

        Set<String> store = new HashSet<String>();
        for(String name : names){
            if (store.add(name)==false) {
                System.out.println("Duplicate value is:" +name);
            }
        }

        //3. Using HashMap

         Map <String, Integer> storeMap = new HashMap<String, Integer>();

         for(String name: names ){
            Integer count = storeMap.get(name);
            if (count == null) {
                storeMap.put(name, 1);
            }
            else{
                storeMap.put(name, ++count);
            }
         }

        //  get the value from this Hashmap

        Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
         for(Entry<String, Integer> entry: entrySet){
            if (entry.getValue()>1) {
                System.out.println("Duplicate element: " + entry.getKey());
            }
         }
         
    }
}
