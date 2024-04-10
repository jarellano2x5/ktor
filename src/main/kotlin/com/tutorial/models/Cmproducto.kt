package com.tutorial.models

import kotlinx.serialization.Serializable

@Serializable
class Cmproducto (
    val idProducto: Int = 0,
    val codigo: String = "",
    val nombre: String = "",
    val descripcion: String = "",
    val precio: Float = 0.0f,
    val idEstatus: Int = 0,
    val idLinea: Int = 0,
    val idApartado: Int = 0,
    val idUnidad: Int = 0,
    val idImpuesto: Int = 0
)