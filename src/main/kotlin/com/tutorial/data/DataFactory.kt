package com.tutorial.data

import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

object DataFactory {
    fun init() {
        Database.connect("jdbc:postgresql://tgtendencestudios.com:5432/ecommprod", driver = "org.postgresql.Driver", user = "develop", password = "d3v3l0p#")

        transaction {
            SchemaUtils.create(CftipoEntity)
            SchemaUtils.create(CfestatusEntity)
            SchemaUtils.create(CfpaisEntity)
            SchemaUtils.create(CfgravamenEntity)
            SchemaUtils.create(CfempresaEntity)
            SchemaUtils.create(CfimagenEntity)
        }
    }
}