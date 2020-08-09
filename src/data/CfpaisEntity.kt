package com.tutorial.data

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object CfpaisEntity: Table("CFPais") {
    val idPais: Column<Int> = integer("IdPais").autoIncrement()
    val nombre: Column<String> = varchar("Nombre", 50)
    val idioma: Column<String> = varchar("Idioma", 2)
    val inicial: Column<String> = varchar("Inicial", 2)
    override val primaryKey: PrimaryKey = PrimaryKey(idPais)
}