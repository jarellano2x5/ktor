package com.tutorial.models

import kotlinx.serialization.Serializable

@Serializable
class Cmmenu (
    val idMenu: Int = 0,
    val nombre: String = "",
    val activo: Boolean = true
)