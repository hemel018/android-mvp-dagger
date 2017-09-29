package com.rana.ui.main;

import com.rana.data.ApiService;

import javax.inject.Inject;

/**
 * Created by rana on 9/26/17.
 */

public class MainPresenterImpl implements MainPresenter {

    MainView mainView;
    ApiService apiService;

    @Inject
    public MainPresenterImpl(ApiService apiService, MainView mainView) {
        this.mainView = mainView;
        this.apiService = apiService;
    }

    @Override
    public void loadMain() {
        apiService.loadData();
        mainView.onMainLoaded();
    }
}
