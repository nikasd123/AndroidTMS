package com.example.tmsandroid.app.presentation.view_models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tmsandroid.app.domain.models.DomainContactList
import com.example.tmsandroid.app.domain.use_cases.ContactUseCase

open class ContactsViewModel : ViewModel(){
    private val _contactList = MutableLiveData<DomainContactList>()
    val contactList: MutableLiveData<DomainContactList> = _contactList

    init {
        getContacts()
    }

    private fun getContacts() {
        _contactList.value = ContactUseCase().getContacts()
    }
}