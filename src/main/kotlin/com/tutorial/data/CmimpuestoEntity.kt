package com.tutorial.data

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object CmimpuestoEntity: Table("CMImpuesto") {
    val idImpuesto: Column<Int> = integer("IdImpuesto").autoIncrement()
    val tasa: Column<Float> = float("Tasa")
    val cuota: Column<Float> = float("Cuota")
    val activo: Column<Boolean> = bool("Activo")
    val idGravamen: Column<Int> = integer("IdGravamen").references(CfgravamenEntity.idGravamen)
    override val primaryKey: PrimaryKey = PrimaryKey(idImpuesto)
}