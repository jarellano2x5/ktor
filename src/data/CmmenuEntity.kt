package com.tutorial.data

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object CmmenuEntity: Table("CMMenu") {
    val idMenu: Column<Int> = integer("IdMenu").autoIncrement()
    val nombre: Column<String> = varchar("Nombre", 40)
    val activo: Column<Boolean> = bool("Activo")
    override val primaryKey: PrimaryKey = PrimaryKey(idMenu)
}