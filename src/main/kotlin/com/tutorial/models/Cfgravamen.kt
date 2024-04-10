package com.tutorial.models

import kotlinx.serialization.Serializable

@Serializable
data class Cfgravamen (
    val idGravamen: Int = 0,
    val inicial: String = "",
    val nombre: String = "",
    val activo: Boolean = true,
    val idPais: Short = 0
)