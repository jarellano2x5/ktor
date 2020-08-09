package com.tutorial.data

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object CftipoEntity: Table("CFTipo") {
    val idTipo: Column<Int> = integer("IdTipo").autoIncrement()
    val nombre: Column<String> = varchar("Nombre", 30)
    val activo: Column<Boolean> = bool("Activo")
    override val primaryKey: PrimaryKey = PrimaryKey(idTipo)
}