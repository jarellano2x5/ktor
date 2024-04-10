package com.tutorial.models

import kotlinx.serialization.Serializable

@Serializable
data class Cftipo (
    val idTipo: Int = 0,
    val nombre: String = "",
    val activo: Boolean = true
)