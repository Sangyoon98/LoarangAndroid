package com.sangyoon.loarang.ui.setting

import androidx.lifecycle.ViewModel
import com.sangyoon.loarang.data.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SettingViewModel @Inject constructor(
    private val characterRepository: CharacterRepository
) : ViewModel() {

}