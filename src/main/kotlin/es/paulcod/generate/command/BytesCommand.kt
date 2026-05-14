package es.paulcod.generate.command

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.CliktError
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required
import com.github.ajalt.clikt.parameters.options.validate
import com.github.ajalt.clikt.parameters.types.choice
import com.github.ajalt.clikt.parameters.types.int
import es.paulcod.generate.encoder.impl.Base64ByteArrayEncoder
import es.paulcod.generate.encoder.impl.Base64UrlSafeByteArrayEncoder
import es.paulcod.generate.encoder.impl.BinaryByteArrayEncoder
import es.paulcod.generate.encoder.impl.HexByteArrayEncoder
import es.paulcod.generate.generator.BytesGenerator

class BytesCommand : CliktCommand(
    name = "bytes"
) {

    private val encoders = listOf(
        HexByteArrayEncoder(),
        Base64ByteArrayEncoder(),
        Base64UrlSafeByteArrayEncoder(),
        BinaryByteArrayEncoder()
    )

    private val length by option(
        "--length", "-l",
        help = "Number of random bytes"
    ).int().required().validate {
        if (it <= 0) fail("Length must be at least 1")
    }

    private val format by option(
        "--format", "-f",
        help = "Output format"
    ).choice(*encoders.map { it.name }.toTypedArray()).required()

    override fun run() {
        val encoder = encoders.firstOrNull { it.name == format } ?: throw CliktError("Unknown encoder")

        echo(BytesGenerator.generateBytes(length, encoder))
    }

}