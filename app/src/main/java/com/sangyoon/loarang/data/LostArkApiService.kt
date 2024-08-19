package com.sangyoon.loarang.data

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface LostArkApiService {
    @GET("characters/{characterName}/siblings")
    suspend fun getCharacterInfo(
        @Path("characterName") characterName: String,
        @Header("authorization") auth: String
    ): CharacterInfoResponse
}