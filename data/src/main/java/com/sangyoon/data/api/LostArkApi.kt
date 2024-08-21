package com.sangyoon.data.api

import com.sangyoon.data.model.CharacterInfoData
import com.sangyoon.domain.entity.CharacterInfoEntity
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface LostArkApi {
    @GET("characters/{characterName}/siblings")
    suspend fun getCharacterInfo(
        @Path("characterName") characterName: String,
        @Header("authorization") auth: String
    ): CharacterInfoData
}