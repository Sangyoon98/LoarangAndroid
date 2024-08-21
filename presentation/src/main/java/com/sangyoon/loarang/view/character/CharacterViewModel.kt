package com.sangyoon.loarang.view.character

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.sangyoon.domain.usecase.GetCharacterInfo
import javax.inject.Inject

class CharacterViewModel @Inject constructor(
    private val getCharacterInfo: GetCharacterInfo,
    savedStateHandle: SavedStateHandle
): ViewModel() {

}