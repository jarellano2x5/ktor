package com.tutorial.models

import java.io.Serializable

data class Cfpais (
    val idPais: Int = 0,
    val nombre: String = "",
    val idioma: String = "",
    val inicial: String = ""
) : Serializable