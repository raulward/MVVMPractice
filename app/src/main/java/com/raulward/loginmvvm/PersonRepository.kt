package com.raulward.loginmvvm

class PersonRepository {

    fun login(email: String, password: String): Boolean {
        return email != "" && password != ""
    }

}