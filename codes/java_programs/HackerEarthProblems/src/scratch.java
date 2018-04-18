import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class scratch {
    static int castleTowers(int n, Integer[] ar) {
        //Arrays.sort(ar, Collections.reverseOrder());
        //System.out.println(Arrays.toString(ar));
        int maxi = ar[0];
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (maxi >= ar[i]) {
                if(maxi == ar[i])
            		cnt += 1;
            } else {
                //break;
            	maxi=ar[i];
            	cnt=1;
            }
        }
        return cnt;
    }
	public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] ar = new Integer[n];

        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        
        int result = castleTowers(n, ar);
        System.out.println(result);
        in.close();
	    }
}

