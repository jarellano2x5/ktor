package com.tutorial.data

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object CfempresaEntity : Table("CFEmpresa") {
    val idEmpresa: Column<Int> = integer("IdEmpresa").autoIncrement()
    val rfc: Column<String> = varchar("RFC", 13)
    val nombre: Column<String> = varchar("Nombre", 300)
    val alias: Column<String> = varchar("Alias", 20)
    val cp: Column<String> = varchar("CP", 5)
    val tagLine: Column<String> = varchar("TagLine", 150)
    val idPais: Column<Int> = integer("IdPais").references(CfpaisEntity.idPais)
    val idTipo: Column<Int> = integer("IdTipo").references(CftipoEntity.idTipo)
    val idEstatus: Column<Int> = integer("IdEstatus").references(CfestatusEntity.idEstatus)
    override val primaryKey: PrimaryKey = PrimaryKey(idEmpresa)
}