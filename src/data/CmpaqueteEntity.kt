package com.tutorial.data

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object CmpaqueteEntity: Table("CMPaquete") {
    val idPaquete: Column<Int> = integer("IdPaquete").autoIncrement()
    val cantidad: Column<Int> = integer("Cantidad")
    val idProducto: Column<Int> = integer("IdProducto").references(CmproductoEntity.idProducto)
    val idPromocion: Column<Int> = integer("IdPromocion").references(CmpromocionEntity.idPromocion)
    override val primaryKey: PrimaryKey = PrimaryKey(idPaquete)
}