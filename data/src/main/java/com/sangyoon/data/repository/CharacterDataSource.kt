package com.sangyoon.data.repository

import com.sangyoon.domain.entity.CharacterInfoEntity
import com.sangyoon.domain.util.ApiResult

interface CharacterDataSource {
    interface Remote {
        suspend fun getCharacterInfo(characterName: String): ApiResult<CharacterInfoEntity>
    }
}