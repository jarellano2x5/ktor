package com.tutorial.data

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object CmdireccionEntity: Table("CMDireccion") {
    val idDireccion: Column<Int> = integer("IdDireccion").autoIncrement()
    val cp: Column<String> = varchar("CP", 5)
    val calle: Column<String> = varchar("Calle", 100)
    val noInt: Column<String> = varchar("Noint", 25)
    val noExt: Column<String> = varchar("NoExt", 25)
    val colonia: Column<String> = varchar("Colonia", 100)
    val alcaldia: Column<String> = varchar("Alcaldia", 100)
    val referencia: Column<String> = varchar("Referencia", 120)
    val activo: Column<Boolean> = bool("Activo")
    val idCliente: Column<Int> = integer("IdCliente").references(CmclienteEntity.idCliente)
    override val primaryKey: PrimaryKey = PrimaryKey(idDireccion)
}