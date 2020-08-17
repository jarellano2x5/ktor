package com.tutorial.data

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object CmunidadEntity: Table("CMUnidad") {
    val idUnidad: Column<Int> = integer("IdUnidad").autoIncrement()
    val nombre: Column<String> = varchar("Nombre", 40)
    val simbolo: Column<String> = varchar("Simbolo", 3)
    val activo: Column<Boolean> = bool("Activo")
    override val primaryKey: PrimaryKey = PrimaryKey(idUnidad)
}