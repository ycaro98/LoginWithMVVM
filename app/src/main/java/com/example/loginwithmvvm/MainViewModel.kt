package com.example.loginwithmvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val userRepository = UserRepository()
    private var login = MutableLiveData<String>()

    fun login(): LiveData<String> {
        return login
    }

    fun doLogin(email: String, password: String) {
        if (email.isEmpty() || password.isEmpty()) {
            login.value = "Fields not filled in"
        } else if (userRepository.login(email, password)){
            login.value = "Login OK"
        } else {
            login.value = "Login Error"
        }
    }
}