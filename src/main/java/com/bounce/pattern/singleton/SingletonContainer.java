package com.bounce.pattern.singleton;

public class SingletonContainer {

    private static AdsManager adsManagerInstance;


    private SingletonContainer() {
    }

    public static AdsManager getAdsManagerInstance() {
        if (adsManagerInstance == null) {
            adsManagerInstance = new AdsManager();
        }

        return adsManagerInstance;
    }

}
