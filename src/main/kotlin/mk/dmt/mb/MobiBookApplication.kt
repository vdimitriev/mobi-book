package mk.dmt.mb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MobiBookApplication

fun main(args: Array<String>) {
	runApplication<MobiBookApplication>(*args)
}
