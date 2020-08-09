package com.tutorial.repositories

import com.tutorial.data.CfestatusEntity
import com.tutorial.models.Cfestatus
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.statements.InsertStatement
import org.jetbrains.exposed.sql.transactions.transaction

class CfestatusRepository: Repository<Cfestatus> {
    override suspend fun create(t: Cfestatus): Int {
        var reg: InsertStatement<Number>? = null
        transaction {
            reg = CfestatusEntity.insert {sta ->
                sta[nombre] = t.nombre
                sta[activo] = t.activo
            }
        }
        var result: ResultRow? = reg?.resultedValues?.get(0)
        if (result == null) {
            return 0
        } else {
            return result[CfestatusEntity.idEstatus].toInt()
        }
    }

    override suspend fun update(t: Cfestatus): Int {
        TODO("Not yet implemented")
    }

    override suspend fun findOne(id: Int): Cfestatus {
        TODO("Not yet implemented")
    }

    override suspend fun find(bsq: String): List<Cfestatus> {
        var list: List<Cfestatus> = listOf<Cfestatus>()
        transaction {
            list = CfestatusEntity.selectAll().map {e ->
                Cfestatus(
                    idEstatus = e[CfestatusEntity.idEstatus],
                    nombre = e[CfestatusEntity.nombre],
                    activo = e[CfestatusEntity.activo]
                )
            }.toList()
        }
        return list
    }
}