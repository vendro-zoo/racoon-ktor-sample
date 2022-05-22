package it.zoo.vendro

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import it.zoo.vendro.plugins.configureHTTP
import it.zoo.vendro.plugins.configureMonitoring
import it.zoo.vendro.plugins.configureRouting
import it.zoo.vendro.plugins.configureSerialization

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureHTTP()
        configureMonitoring()
        configureSerialization()
    }.start(wait = true)
}
