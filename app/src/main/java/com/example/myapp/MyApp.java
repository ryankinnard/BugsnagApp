package com.example.myapp;

import android.app.Application;

import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.Bugsnag;
import com.bugsnag.android.Configuration;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class MyApp extends Application {
    @Override
    public void onCreate() {

        super.onCreate();
        Bugsnag.start(this, "972de773ffe431874781978f28c2199e");

    }
}
