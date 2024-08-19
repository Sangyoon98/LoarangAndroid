package com.sangyoon.loarang.data

class CharacterInfoResponse : ArrayList<CharacterInfoResponse.CharacterInfoResponseItem>(){
    data class CharacterInfoResponseItem(
        val CharacterClassName: String?,
        val CharacterLevel: Int?,
        val CharacterName: String?,
        val ItemAvgLevel: String?,
        val ItemMaxLevel: String?,
        val ServerName: String?
    )
}