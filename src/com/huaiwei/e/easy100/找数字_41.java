package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 找数字_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int [][] m=new int[x][y];
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                m[i][j]=sc.nextInt();
            }
        }

        int res[][]=new int[x][y];
        for (int k=0;k<x;k++){
            for (int l=0;l<y;l++){
                int tmp=-1;

                int o=m[k][l];
                for (int p=0;p<x;p++){
                    for (int u=0;u<y;u++){
                        if (p==k&&u==l) continue;
                        if (m[p][u]==o){
                            if (tmp==-1){
                                tmp=Math.abs(p-k)+Math.abs(u-l);
                            }else {
                                tmp=Math.min(tmp,Math.abs(p-k)+Math.abs(u-l));
                            }
                        }
                    }
                }
                res[k][l]=tmp;
            }
        }
        for (int r=0;r<x;r++){
            for (int e=0;e<y;e++){
                System.out.print(res[r][e]+" ");
            }
            System.out.println();
        }

    }
}
