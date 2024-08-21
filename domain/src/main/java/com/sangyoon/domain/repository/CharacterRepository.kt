package com.sangyoon.domain.repository

import com.sangyoon.domain.entity.CharacterInfoEntity
import com.sangyoon.domain.util.ApiResult

interface CharacterRepository {
    suspend fun getCharacterInfo(characterName: String) : ApiResult<CharacterInfoEntity>
}