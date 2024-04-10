package com.tutorial.models

import kotlinx.serialization.Serializable

@Serializable
data class Cfpais (
    val idPais: Int = 0,
    val nombre: String = "",
    val idioma: String = "",
    val inicial: String = ""
)