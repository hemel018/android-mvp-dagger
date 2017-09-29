package com.rana.ui.main;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rana.R;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

/**
 * Created by rana on 9/25/17.
 */

public class MainActivity extends AppCompatActivity implements MainView {

    @Inject
    MainPresenter mainPresenter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter.loadMain();
    }

    @Override
    public void onMainLoaded() {

    }
}
