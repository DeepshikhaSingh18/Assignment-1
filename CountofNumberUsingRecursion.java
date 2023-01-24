
    import java.util.*;
    public class CountofNumberUsingRecursion {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            //System.out.println(count(n));
            count(n);
        }
        public static void count(int n) {
            if (n > 0) {
                count(n-1);
                System.out.print(n+" ");
            }
            return;
        }
    }

