import java.util.*;
public class FiboRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(fibo(N));

    }
    public static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
