package org.hrtwt

import org.hrtwt.ast.Expression

fun main(src: String): Expression {
    val tokens = Lexer().lex(src)
    val exp = Parser().parse(tokens)

    return exp
}