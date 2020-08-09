package com.tutorial.data

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object CfimagenEntity: Table("CFImagen") {
    val idImagen: Column<Int> = integer("IdImagen").autoIncrement()
    val tipo: Column<String> = varchar("Tipo", 12)
    val nombreOriginal: Column<String> = varchar("NombreOriginal", 100)
    val nombre: Column<String> = varchar("Nombre", 40)
    val estension: Column<String> = varchar("Extension", 8)
    val idEmpresa: Column<Int> = integer("IdEmpresa").references(CfempresaEntity.idEmpresa)
    override val primaryKey: PrimaryKey = PrimaryKey(idImagen)
}