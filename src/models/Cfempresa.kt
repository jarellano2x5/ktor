package com.tutorial.models

import java.io.Serializable

data class Cfempresa (
    val idEmpresa: Int = 0,
    val rfc: String = "",
    val nombre: String = "",
    val alias: String = "",
    val cp: String = "",
    val tagLine: String = "",
    val idPais: Short = 0,
    val idTipo: Short = 0,
    val idEstatus: Short = 0
) : Serializable