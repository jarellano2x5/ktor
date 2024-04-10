package com.tutorial.data

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table
import java.sql.Date

object CmpedidoEntity: Table("CMPedido") {
    val idPedido: Column<Int> = integer("IdPedido").autoIncrement()
    //val fecha: Column<Date> = datetime("Fecha")
    val subtotal: Column<Float> = float("Subtotal")
    val impuestos: Column<Float> = float("Impuestos")
    val total: Column<Float> = float("Total")
    val pagado: Column<Boolean> = bool("Pagado")
    val entregado: Column<Boolean> = bool("Entregado")
    val idCliente: Column<Int> = integer("IdCliente").references(CmclienteEntity.idCliente)
    val idDireccion: Column<Int> = integer("IdDireccion").references(CmdireccionEntity.idDireccion)
    override val primaryKey: PrimaryKey = PrimaryKey(idPedido)
}