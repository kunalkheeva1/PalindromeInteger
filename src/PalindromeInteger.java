public class PalindromeInteger {

    //creating a method to check if a number is a palindrome or not
    public static boolean palindromeYN(int num){
    //storing the value of num in n as num will get updated after the loop
        int n=num;
        //now taking two more integers, to apply reverse function
        //and initialize them with 0
        int s=0,r=0;
        //loop runs until the num becomes zero
        while(num>0){
            //first there will be r which will store the remainders from the number divisions
            r=num%10;
            //then the num will be updated by 10th division eg 123 becomes 12 (123/10 = 12)
            num=num/10;
            //now there is a n integer that is storing these values
            //at first s is 0 so 0*10 +3 =3, then it becomes 3*10+2 = 32 and then so on
            s= s*10+r;
        }
        //and if the number i get by it is same as num then its true;
        if(s==n){
            return true;
        }return false;
    }
    public static void main(String[] args) {
        System.out.println(palindromeYN(121));

    }
}