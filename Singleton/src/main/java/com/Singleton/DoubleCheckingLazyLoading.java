package com.Singleton;

public class DoubleCheckingLazyLoading {
    private DoubleCheckingLazyLoading(){}

    private static DoubleCheckingLazyLoading instance;

    public static DoubleCheckingLazyLoading getInstance() {
        if(instance==null){
            synchronized (DoubleCheckingLazyLoading.class){
                if (instance==null){
                    instance= new DoubleCheckingLazyLoading();
                }
            }
        }
        return instance;
    }
}
