package com.example.sudoku_app

import com.google.gson.annotations.SerializedName

data class Response (
    @SerializedName("mode"   ) var mode   : Int?              = null,
    @SerializedName("values" ) var values : ArrayList<String> = arrayListOf(),
    @SerializedName("level"  ) var level  : Int?              = null
)