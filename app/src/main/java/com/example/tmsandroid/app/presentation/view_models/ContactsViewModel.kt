package com.example.tmsandroid.app.presentation.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tmsandroid.app.domain.models.DomainContactList
import com.example.tmsandroid.app.domain.use_cases.ContactUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class ContactsViewModel @Inject constructor(
    private val contactUseCase: ContactUseCase
) : ViewModel(){

    private val _contactList = MutableLiveData<DomainContactList>()
    val contactList: LiveData<DomainContactList> = _contactList

    init {
        getContacts()
    }

    private fun getContacts() {
        _contactList.value = ContactUseCase.
    }
}