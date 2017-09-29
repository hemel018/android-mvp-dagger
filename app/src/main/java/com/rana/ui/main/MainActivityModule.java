package com.rana.ui.main;

import com.rana.data.ApiService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by rana on 9/25/17.
 */

@Module
public class MainActivityModule {

    @Provides
    MainView provideMainView(MainActivity activity) {
        return activity;
    }

    @Provides
    MainPresenter provideMainPresenter(ApiService apiService, MainView mainView) {
        return new MainPresenterImpl(apiService, mainView);
    }
}
