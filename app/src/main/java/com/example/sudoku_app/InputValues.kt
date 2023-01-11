package com.example.sudoku_app

import com.google.gson.annotations.SerializedName

data class InputValues (
    @SerializedName("sp") var sp: Double? = null,
    @SerializedName("acceptedError") var acceptedError: Double? = null,
    @SerializedName("color") var color: Int? = null,
    @SerializedName("setValue") var setValue: Int? = null
)
