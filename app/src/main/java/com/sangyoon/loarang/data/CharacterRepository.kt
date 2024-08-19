package com.sangyoon.loarang.data

import java.util.concurrent.Flow

interface CharacterRepository {
    fun getCharacterInfo() : CharacterInfoResponse
}