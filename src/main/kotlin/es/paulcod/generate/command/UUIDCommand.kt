package es.paulcod.generate.command

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required
import com.github.ajalt.clikt.parameters.types.choice
import es.paulcod.generate.generator.UUIDGenerator

class UUIDCommand : CliktCommand(
    name = "uuid"
) {

    private val format by option(
        "--format", "-f",
        help = "Output format"
    ).choice("v1", "v4", "v6", "v7", "ulid", "ulidmono").required()

    override fun run() {
        echo(UUIDGenerator.generateUUID(format))
    }

}