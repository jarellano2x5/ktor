package com.tutorial.data

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object CmclienteEntity: Table("CMCliente") {
    val idCliente: Column<Int> = integer("IdCliente").autoIncrement()
    val nombre: Column<String> = varchar("Nombre", 100)
    val telefono: Column<String> = varchar("Telefono", 20)
    val activo: Column<Boolean> = bool("Activo")
    val idUsuario: Column<Int> = integer("IdUsuario")
    override val primaryKey: PrimaryKey = PrimaryKey(idCliente)
}