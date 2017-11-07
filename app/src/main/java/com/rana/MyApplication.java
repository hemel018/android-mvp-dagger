package com.rana;

import android.app.Application;

import com.rana.dagger.AppComponent;
import com.rana.dagger.AppModule;
import com.rana.dagger.DaggerAppComponent;
import com.rana.dagger.NetModule;

/**
 * Created by rana on 9/25/17.
 */

public class MyApplication extends Application {

    AppComponent appComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).netModule(new NetModule("https://api.github.com")).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

}
