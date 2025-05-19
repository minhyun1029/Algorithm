import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final int Max =1000000;
        boolean[] isNotPrime = new boolean[Max+1];

        isNotPrime[0] = isNotPrime[1] = true;
        for(int i=2;i*i<=Max;i++) {
            if(!isNotPrime[i]) {
                for(int j=i*i;j<=Max;j+=i) {
                    isNotPrime[j] = true;
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.parseInt(br.readLine());

        while(T-->0) {
            int n=Integer.parseInt(br.readLine());
            int count=0;
            for(int i=2;i<=n/2;i++) {
                if(!isNotPrime[i] && !isNotPrime[n-i]) {
                    count++;
                }
            }
            System.out.println(count);
        }


    }
}
