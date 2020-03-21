package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SmallestID{
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);
        String ip = ins.nextLine();

        String[] na = ip.split(" ");
        int noi = Integer.parseInt(na[0]);
        System.out.println("input" + Arrays.toString(na));
        Long[] in = new Long[noi];
        System.out.println();
        for(int i =1; i<= noi;i++){
            in[i-1] = Long.parseLong(na[i]);
        }
        System.out.println("input" + Arrays.toString(in));
        System.out.println(FN(in));
    }
    public static int FN(Long[] ins){

        boolean a = false;
        int n = 2;
        while(!a){
            HashSet<Long> um = new HashSet<>();
            for(int i=0;i<ins.length; i++){
                Long ni = ins[i]%n;
                if(!um.contains(ni)){
                    break;
                }else{
                    um.add(ni);
                    if(i == ins.length){
                        a = true;
                    }
                }
            }
            if(!a){
                n++;
            }
        }
        return n;
    }
}

