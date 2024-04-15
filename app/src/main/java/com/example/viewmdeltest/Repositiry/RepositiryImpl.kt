package com.example.viewmdeltest.Repositiry

import androidx.lifecycle.MutableLiveData
import com.example.viewmdeltest.Model.Person
import java.util.Calendar

class RepositiryImpl:RepositiryInter {
    override fun calculateAge(name: String, age: String): MutableLiveData<Person> {
        val infoMutableLiveData=MutableLiveData<Person>()
        val currentYear=Calendar.getInstance().get(Calendar.YEAR)
        val yourAge=currentYear-age.toInt()
        val person=Person(name,yourAge.toString())
        infoMutableLiveData.postValue(person)
        return infoMutableLiveData
    }
}