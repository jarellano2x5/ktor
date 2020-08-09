package com.tutorial.data

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object CfgravamenEntity: Table("CFGravamen") {
    val idGravamen: Column<Int> = integer("IdGravamen").autoIncrement()
    val inicial: Column<String> = varchar("Inicial", 6)
    val nombre: Column<String> = varchar("Nombre", 30)
    val activo: Column<Boolean> = bool("Activo")
    val idPais: Column<Int> = integer("IdPais").references(CfpaisEntity.idPais)
    override val primaryKey: PrimaryKey = PrimaryKey(idGravamen)
}