package com.sangyoon.domain.usecase

import com.sangyoon.domain.entity.CharacterInfoEntity
import com.sangyoon.domain.repository.CharacterRepository
import com.sangyoon.domain.util.ApiResult

class GetCharacterInfo(
    private val characterRepository: CharacterRepository
) {
    suspend operator fun invoke(characterName: String): ApiResult<CharacterInfoEntity> = characterRepository.getCharacterInfo(characterName)
}