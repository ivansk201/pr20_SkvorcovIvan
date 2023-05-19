package com.example.test16pracafsfsfsdsfsdf

import androidx.lifecycle.ViewModel

object CrimeListViewModel : ViewModel() {

    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData =crimeRepository.getCrimes()


}