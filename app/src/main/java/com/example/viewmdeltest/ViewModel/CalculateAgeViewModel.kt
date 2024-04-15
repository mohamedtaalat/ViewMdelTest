package com.example.viewmdeltest.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.viewmdeltest.Model.Person
import com.example.viewmdeltest.Repositiry.RepositiryImpl
import com.example.viewmdeltest.Repositiry.RepositiryInter

class CalculateAgeViewModel:ViewModel() {
    val repositiryImpl:RepositiryInter=RepositiryImpl()
    fun calculateAge(name:String ,age :String): LiveData<Person> {
        val person=repositiryImpl.calculateAge(name,age)
        return person
    }
}