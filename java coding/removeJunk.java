public class removeJunk {
    public static void main(String[] args) {
        
        String s = "与其不如 laitin string 0123456789";

        // regular Expression ([a-zA-Z0-9])

        s =s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
    }
}
