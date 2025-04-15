public class reverseInteger {
    public static void main(String[] args) {

        //  Using Algo

        int num = 123456;
        int rev = 0;

        while (num !=0) {
            rev = rev * 10 + num % 10;
            num = num/10;
        }
        System.out.println("Reverse Num is :" + rev);

        //  Using StringBuffere

        int num1 = 1234567;

        StringBuffer sk = new StringBuffer(String.valueOf(num1));

        System.out.println(sk.reverse());
    }
}
