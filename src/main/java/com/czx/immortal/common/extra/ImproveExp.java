package com.czx.immortal.common.extra;

import java.util.HashMap;

/**
 * @author : chenzhx
 * @since : 2019/6/30/030
 **/
public class ImproveExp {
    public static HashMap<Integer, Integer> EXP;
    static {
        EXP = new HashMap<>(99);
        int initExp = 88;
        int cExp;
        for(int i = 1; i< 99; i++){
            cExp = initExp + i * 2 * (i/2);
            EXP.put(i, cExp);
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<EXP.size();i++){
            System.out.println((i+1)+":====:"+EXP.get(i+1));
        }
    }
}
