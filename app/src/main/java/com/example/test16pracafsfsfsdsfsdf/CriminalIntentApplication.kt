package com.example.test16pracafsfsfsdsfsdf

import android.app.Application

class CriminalIntentApplication : Application()
{

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}