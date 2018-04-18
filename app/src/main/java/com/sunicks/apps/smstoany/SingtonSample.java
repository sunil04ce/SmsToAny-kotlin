package com.sunicks.apps.smstoany;

import android.app.Application;

public class SingtonSample extends Application {
    private static final SingtonSample ourInstance = new SingtonSample();

    public static SingtonSample getInstance() {
        return ourInstance;
    }

    public SingtonSample() {
    }
}
