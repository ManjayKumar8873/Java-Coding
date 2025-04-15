
public class reverse {
    public static void main(String[] args) {
        String s = "manjay";

        //  using for loop

        int len = s.length();
        String rev = "";

        for(int i = len-1; i>=0; i--){
            rev = rev + s.charAt(i); 
        }
        System.out.println(rev);

        // using StringBuffer

        StringBuffer sf = new StringBuffer(s);
        System.out.println(sf.reverse());

    }
}