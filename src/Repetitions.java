import java.util.Locale;
import java.util.Scanner;

public class Repetitions {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length(),i=1,maxCount=0,localMax = 0;
        if(n == 0)
        {
            System.out.print(n);
            return;
        }
        for(;i<n;i++){
            if( checkCharacter(s.charAt(i)) && s.charAt(i) == s.charAt(i-1)){
                localMax++;
            }else{
                localMax = 0;
            }
            if(localMax > maxCount){
                maxCount = localMax;
            }
        }
        System.out.print(maxCount+1);
    }

    private static boolean checkCharacter(char v) {
        if(v == 'A' || v == 'C' || v == 'G' || v == 'T'){
            return true;
        }
        return false;
    }
}
