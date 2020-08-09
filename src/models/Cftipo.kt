package com.tutorial.models

import java.io.Serializable

data class Cftipo (
    val idTipo: Int = 0,
    val nombre: String = "",
    val activo: Boolean = true
) : Serializable