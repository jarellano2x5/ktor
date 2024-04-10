package com.tutorial.models

import kotlinx.serialization.Serializable

@Serializable
class Cmunidad (
    val idUnidad: Int = 0,
    val nombre: String = "",
    val simbolo: String = "",
    val Activo: Boolean = true
)