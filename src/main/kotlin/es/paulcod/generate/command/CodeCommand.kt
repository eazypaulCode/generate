package es.paulcod.generate.command

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required
import com.github.ajalt.clikt.parameters.options.validate
import com.github.ajalt.clikt.parameters.types.int
import es.paulcod.generate.generator.CodeGenerator

class CodeCommand : CliktCommand(
    name = "code"
) {

    private val length by option(
        "--length", "-l",
        help = "Code length"
    ).int().required().validate {
        if (it <= 0) fail("Length must be at least 1")
    }

    override fun run() {
        echo(CodeGenerator.generateCode(length))
    }

}