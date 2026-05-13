package es.paulcod.generate

import com.github.ajalt.clikt.core.main
import com.github.ajalt.clikt.core.subcommands
import es.paulcod.generate.command.BytesCommand
import es.paulcod.generate.command.CodeCommand
import es.paulcod.generate.command.RootCommand

fun main(args: Array<String>) = RootCommand().subcommands(BytesCommand(), CodeCommand()).main(args)