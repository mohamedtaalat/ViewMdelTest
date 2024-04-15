package com.example.viewmdeltest.Repositiry

import androidx.lifecycle.MutableLiveData
import com.example.viewmdeltest.Model.Person

interface RepositiryInter {
    fun calculateAge( name:String, age:String):MutableLiveData<Person>
}