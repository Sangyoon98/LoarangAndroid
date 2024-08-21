package com.sangyoon.data.repository

import com.sangyoon.data.api.LostArkApi
import com.sangyoon.data.model.toEntity
import com.sangyoon.domain.entity.CharacterInfoEntity
import com.sangyoon.domain.util.ApiResult

class CharacterRemoteDataSource(private val lostArkApi: LostArkApi) : CharacterDataSource.Remote{
    override suspend fun getCharacterInfo(characterName: String): ApiResult<CharacterInfoEntity> = try {
        val result = lostArkApi.getCharacterInfo(characterName, "123")
        ApiResult.Success(result.toEntity())
    } catch (e: Exception) {
        ApiResult.Error(e)
    }
}