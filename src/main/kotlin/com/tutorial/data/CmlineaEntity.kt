package com.tutorial.data

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object CmlineaEntity: Table("CMLinea") {
    val idLinea: Column<Int> = integer("IdLinea").autoIncrement()
    val nombre: Column<String> = varchar("Nombre", 40)
    val activo: Column<Boolean> = bool("Activo")
    val idMenu: Column<Int> = integer("IdMenu").references(CmmenuEntity.idMenu)
    override val primaryKey: PrimaryKey = PrimaryKey(idLinea)
}