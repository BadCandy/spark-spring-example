package me.christ9979.sparkspring.runner

import me.christ9979.sparkspring.service.SimplePersonService
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component


@Component
class SparkRunner(
    private val simplePersonService: SimplePersonService
) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        simplePersonService.printSimplePerson()
    }
}