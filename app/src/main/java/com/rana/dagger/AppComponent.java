package com.rana.dagger;

import android.app.Application;

import com.rana.MyApplication;
import com.rana.ui.main.MainActivity;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by rana on 9/25/17.
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
