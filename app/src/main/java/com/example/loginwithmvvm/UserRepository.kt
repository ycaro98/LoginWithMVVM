package com.example.loginwithmvvm

class UserRepository {
    fun login(email: String, password: String): Boolean {
        return (email =="admin" && password == "pass")
    }

}