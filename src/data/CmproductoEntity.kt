package com.tutorial.data

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.Column

object CmproductoEntity: Table("CMProducto") {
    val idProducto: Column<Int> = integer("IdProducto").autoIncrement()
    val codigo: Column<String> = varchar("Codigo", 15)
    val nombre: Column<String> = varchar("Nombre", 120)
    val descripcion: Column<String> = varchar("Descripcion", 500)
    val precio: Column<Float> = float("Precio")
    val idEstatus: Column<Int> = integer("IdEstatus").references(CmestatusEntity.idEstatus)
    val idLinea: Column<Int> = integer("IdLinea").references(CmlineaEntity.idLinea)
    val idApartado: Column<Int> = integer("IdApartado").references(CmapartadoEntity.idApartado)
    val idUnidad: Column<Int> = integer("IdUnidad").references(CmunidadEntity.idUnidad)
    val idImpuesto: Column<Int> = integer("IdImpuesto").references(CmimpuestoEntity.idImpuesto)
    override val primaryKey: PrimaryKey = PrimaryKey(idProducto)
}