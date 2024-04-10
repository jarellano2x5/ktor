package com.tutorial.data

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object CmcantidadEntity: Table("CMCantidad") {
    val idCantidad: Column<Int> = integer("IdCantidad").autoIncrement()
    val compra: Column<Int> = integer("Compra")
    val entrega: Column<Int> = integer("Entrega")
    val idProducto: Column<Int> = integer("IdProducto").references(CmproductoEntity.idProducto)
    val idPromocion: Column<Int> = integer("IdPromocion").references(CmpromocionEntity.idPromocion)
    override val primaryKey: PrimaryKey = PrimaryKey(idCantidad)
}