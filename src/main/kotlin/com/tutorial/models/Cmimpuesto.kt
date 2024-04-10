package com.tutorial.models

import kotlinx.serialization.Serializable

@Serializable
class Cmimpuesto (
    val idImpuesto: Int = 0,
    val tasa: Float = 0.0f,
    val cuota: Float = 0.0f,
    val activo: Boolean = true,
    val idGravamen: Int = 0
)