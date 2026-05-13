package es.paulcod.generate.encoder.impl

import es.paulcod.generate.encoder.ByteArrayEncoder
import kotlin.io.encoding.Base64

class Base64UrlSafeByteArrayEncoder: ByteArrayEncoder {

    override val name: String = "base64urlsafe"

    override fun encode(byteArray: ByteArray): String = Base64.UrlSafe.encode(byteArray)

}