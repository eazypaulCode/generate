package es.paulcod.generate.generator

import com.github.f4b6a3.ulid.UlidCreator
import com.github.f4b6a3.uuid.UuidCreator

object UUIDGenerator {

    fun generateUUID(format: String): String {
        return when (format) {
            "v1" -> UuidCreator.getTimeBased().toString()
            "v4" -> UuidCreator.getRandomBased().toString()
            "v6" -> UuidCreator.getTimeOrdered().toString()
            "v7" -> UuidCreator.getTimeOrderedEpoch().toString()
            "ulid" -> UlidCreator.getUlid().toString()
            "ulidmono" -> UlidCreator.getMonotonicUlid().toString()
            else -> throw IllegalArgumentException("Unknown format '$format'")
        }
    }

}