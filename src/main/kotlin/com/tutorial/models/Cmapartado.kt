package com.tutorial.models

import kotlinx.serialization.Serializable

@Serializable
class Cmapartado (
    val idApartado: Int = 0,
    val nombre: String = "",
    val activo: Boolean = true,
    val idLinea: Int = 0
)