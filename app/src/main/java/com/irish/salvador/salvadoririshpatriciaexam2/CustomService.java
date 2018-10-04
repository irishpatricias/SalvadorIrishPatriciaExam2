package com.irish.salvador.salvadoririshpatriciaexam2;

import android.app.IntentService;

import android.content.Intent;

import android.support.annotation.Nullable;

import android.util.Log;



    public class CustomService extends IntentService {

        public CustomService() {

            super("CustomService");

        }



        @Override

        protected void onHandleIntent(@Nullable Intent intent) {

            Log.d("salvador","Service running");

        }

    }
