package com.example.android_vl_mvvm_shared_viewmodel.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android_vl_mvvm_shared_viewmodel.model.City
import com.example.android_vl_mvvm_shared_viewmodel.model.Repository

class SharedViewModel: ViewModel() {

    private val repository = Repository()

    private val _selectedCity = MutableLiveData<City>()
    val selectedCity: LiveData<City>
        get() = _selectedCity

    fun loadCities(): List<City> {
        return repository.loadCities()
    }

    fun setSelectedCity(city: City) {
        _selectedCity.value = city
    }
}