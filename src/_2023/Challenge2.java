package _2023;

/**
 *
 * @author Ruben Blanco
 */

public class Challenge2 {
    
    public static String ch2(String s){
        int n = 0;
        String res = "";
        for(String op: s.split("")){
            switch(op){
                case "#":
                    n++;
                    break;
                case "@":
                    n--;
                    break;
                case "*":
                    n*=n;
                    break;
                case "&":
                    res += n;
                    break;
            }
        }
        return res;
    }
}
