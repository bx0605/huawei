package com.likou.Medium;

public class 加油站 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int r=0;
        int tmp=0;
        int res=0;
        for (int i=0;i<gas.length;i++){
            tmp+=gas[i]-cost[i];
            if (r>tmp){
                r=tmp;
                res=i;
            }
        }
        return tmp<0?-1:res+1;
    }
}
