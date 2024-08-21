package com.sangyoon.domain.entity

class CharacterInfoEntity : ArrayList<CharacterInfoEntity.CharacterInfoResponseItem>(){
    data class CharacterInfoResponseItem(
        val CharacterClassName: String?,
        val CharacterLevel: Int?,
        val CharacterName: String?,
        val ItemAvgLevel: String?,
        val ItemMaxLevel: String?,
        val ServerName: String?
    )
}