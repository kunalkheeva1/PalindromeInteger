public class PalindromeInteger {
    public static boolean palindromeYN(int num){
        int n=num, s=0,r;
        while(num>0){
            r=num%10;
            num=num/10;
            s= s*10+r;
        }if(s==n){
            return true;
        }return false;
    }
    public static void main(String[] args) {
        System.out.println(palindromeYN(123));

    }
}