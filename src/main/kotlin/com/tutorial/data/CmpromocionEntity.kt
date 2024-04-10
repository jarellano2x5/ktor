package com.tutorial.data

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.FieldSet
import org.jetbrains.exposed.sql.IDateColumnType
import org.jetbrains.exposed.sql.Table
import java.sql.Date

object CmpromocionEntity: Table("CMPromocion") {
    val idPromocion: Column<Int> = integer("IdPromocion").autoIncrement()
    val nombre: Column<String> = varchar("Nombre", 20)
    val descripcion: Column<String> = varchar("Descripcion", 300)
    //val fechaInicio: Column<Date> =
    //val fechaFinal = date("FechaFinal")
    val activo: Column<Boolean> = bool("Activo")
    val idTipo: Column<Int> = integer("IdTipo").references(CmpromocionTipoEntity.idTipo)
    override val primaryKey: PrimaryKey = PrimaryKey(idPromocion)
}