package com.sangyoon.data.model

import com.google.gson.annotations.SerializedName
import com.sangyoon.domain.entity.CharacterInfoEntity

data class CharacterInfoData(
    @SerializedName("CharacterClassName") val CharacterClassName: String,
    @SerializedName("CharacterLevel") val CharacterLevel: Int,
    @SerializedName("CharacterName") val CharacterName: String,
    @SerializedName("ItemAvgLevel") val ItemAvgLevel: String,
    @SerializedName("ItemMaxLevel") val ItemMaxLevel: String,
    @SerializedName("ServerName") val ServerName: String
)

fun CharacterInfoData.toEntity() = CharacterInfoEntity()