package com.tutorial.models

import kotlinx.serialization.Serializable

@Serializable
data class Cfimagen (
    val idImagen: Int = 0,
    val tipo: String = "",
    val nombreOriginal: String = "",
    val nombre: String = "",
    val extension: String = "",
    //val imagen: ByteArray,
    val idEmpresa: Int = 0
)