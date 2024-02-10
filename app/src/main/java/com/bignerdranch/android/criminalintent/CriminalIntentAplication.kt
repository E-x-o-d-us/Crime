package com.bignerdranch.android.criminalintent

import android.app.Application

class CriminalIntentAplication : Application() {

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}