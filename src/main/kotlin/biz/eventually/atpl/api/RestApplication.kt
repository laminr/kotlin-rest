package biz.eventually.atpl.api

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class RestApplication

fun main(args: Array<String>) {
    SpringApplication.run(RestApplication::class.java, *args)
}
