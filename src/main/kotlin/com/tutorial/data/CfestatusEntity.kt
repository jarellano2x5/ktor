package com.tutorial.data

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object CfestatusEntity: Table("CFEstatus") {
    val idEstatus: Column<Int> = integer("IdEstatus").autoIncrement()
    val nombre: Column<String> = varchar("Nombre", 20)
    val activo: Column<Boolean> = bool("Activo")
    override val primaryKey: PrimaryKey = PrimaryKey(idEstatus)
}