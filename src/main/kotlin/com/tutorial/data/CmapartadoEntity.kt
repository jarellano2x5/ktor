package com.tutorial.data

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object CmapartadoEntity: Table("CMApartado") {
    val idApartado: Column<Int> = integer("IdApartado").autoIncrement()
    val nombre: Column<String> = varchar("Nombre", 40)
    val activo: Column<Boolean> = bool("activo")
    val idLinea: Column<Int> = integer("IdLinea").references(idApartado)
    override val primaryKey: PrimaryKey = PrimaryKey(idApartado)
}