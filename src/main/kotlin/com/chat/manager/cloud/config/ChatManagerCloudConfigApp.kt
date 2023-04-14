package com.chat.manager.cloud.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class ChatManagerCloudConfigApp

fun main() {
    runApplication<ChatManagerCloudConfigApp>()
}