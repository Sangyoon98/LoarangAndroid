package com.sangyoon.data.repository

import com.sangyoon.domain.entity.CharacterInfoEntity
import com.sangyoon.domain.repository.CharacterRepository
import com.sangyoon.domain.util.ApiResult

class CharacterRepositoryImpl(private val remote: CharacterDataSource.Remote) : CharacterRepository {
    override suspend fun getCharacterInfo(characterName: String): ApiResult<CharacterInfoEntity> = remote.getCharacterInfo(characterName)
}