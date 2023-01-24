import java.util.*;
public class Powerof2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base=2;
        int p = in.nextInt();
        System.out.println(power(base, p));
    }
    static int power(int base, int p){
        if(p == 0){
            return 1;
        }
        else
            return base*power(base, p-1);
    }
}

