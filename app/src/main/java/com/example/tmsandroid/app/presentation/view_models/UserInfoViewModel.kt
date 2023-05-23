package com.example.tmsandroid.app.presentation.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tmsandroid.app.domain.models.DomainContact
import com.example.tmsandroid.app.domain.use_cases.GetContactInfoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class UserInfoViewModel @Inject constructor(
    private val getContactInfoUseCase: GetContactInfoUseCase
)  : ViewModel() {

    private val _contactInfo = MutableLiveData<DomainContact>()
    val contactInfo: LiveData<DomainContact> = _contactInfo

    init {
        getContactInfo()
    }

    private fun getContactInfo() {
        _contactInfo.value = getContactInfoUseCase.getContactInfo()
    }
}