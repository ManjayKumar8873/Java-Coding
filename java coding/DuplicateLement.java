import java.util.HashSet;
import java.util.Set;

public class DuplicateLement {
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

    }
}
