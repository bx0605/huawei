package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 考勤信息_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            boolean flag=true;
            String str=sc.nextLine();
            String[] s=str.split(" ");
            int cnt=0;
            for (int i=0;i<s.length;i++){

                if (s[i].equals("leaveearly")){
                    s[i]="late";
                }else if (s[i].equals("absent")){
                    cnt++;
                }
                if (i>0&&s[i-1].equals("late")&&s[i].equals("late")){
                    flag=false;
                }

                if (i>5){
                    int tmp=0;
                    for (int j=0;j<7;j++){
                        if (s[i-j].equals("present")){
                            tmp++;
                        }
                    }
                    if (tmp<4){
                        flag=false;
                    }
                }

                if (cnt>1){
                    flag=false;
                }

            }
            System.out.print(flag+" ");
        }
    }
}
