package com.tutorial.data

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object CmdescuentoEntity: Table("CMDescuento") {
    val idDescuento: Column<Int> = integer("IdDescuento").autoIncrement()
    val cantidad: Column<Float> = float("Cantidad")
    val porcentaje: Column<Float> = float("Porcentaje")
    val idProducto: Column<Int> = integer("IdProducto").references(CmproductoEntity.idProducto)
    val idPromocion: Column<Int> = integer("IdPromocion").references(CmpromocionEntity.idPromocion)
    override val primaryKey: PrimaryKey = PrimaryKey(idDescuento)
}