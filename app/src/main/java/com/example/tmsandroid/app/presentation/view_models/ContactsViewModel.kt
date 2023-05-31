package com.example.tmsandroid.app.presentation.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tmsandroid.app.domain.models.DomainContact
import com.example.tmsandroid.app.domain.use_cases.ContactUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ContactsViewModel @Inject constructor(
    private val contactUseCase: ContactUseCase
) : ViewModel() {

    private val _contactList = MutableLiveData<List<DomainContact>>()
    val contactList: LiveData<List<DomainContact>> = _contactList

    init {
        viewModelScope.launch {
            getContacts()
        }
    }

    private suspend fun getContacts() {
        _contactList.value = contactUseCase.getContacts()
    }
}