package es.paulcod.generate.encoder.impl

import es.paulcod.generate.encoder.ByteArrayEncoder
import kotlin.io.encoding.Base64

class Base64ByteArrayEncoder : ByteArrayEncoder {

    override val name: String = "base64"

    override fun encode(byteArray: ByteArray): String = Base64.encode(byteArray)

}