package com.tutorial.models

import kotlinx.serialization.Serializable

@Serializable
class Cmestatus (
    val idEstatus: Int = 0,
    val nombre: String = "",
    val activo: Boolean = true
)