package com.tutorial.models

import kotlinx.serialization.Serializable

@Serializable
class Cmlinea (
    val idLinea: Int = 0,
    val nombre: String = "",
    val activo: Boolean = true,
    val idMenu: Int = 0
)