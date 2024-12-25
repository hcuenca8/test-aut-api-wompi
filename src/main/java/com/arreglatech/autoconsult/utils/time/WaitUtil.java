package com.arreglatech.autoconsult.utils.time;


import com.arreglatech.autoconsult.utils.GeneralUtil;

public class WaitUtil
{

    private WaitUtil(){
        GeneralUtil.notAllowInstantiation();
    }

    public static void stopFor(long time){

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
