package com.arreglatech.autoconsult.utils;


public class GeneralUtil
{

    private GeneralUtil(){
        GeneralUtil.notAllowInstantiation();
    }

    public static void notAllowInstantiation(){
        throw new UnsupportedOperationException();
    }

}
