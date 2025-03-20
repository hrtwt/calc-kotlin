package org.hrtwt

import org.hrtwt.ast.Expression
import org.hrtwt.ast.Number
import org.hrtwt.ast.Plus

class Parser {
    fun parse(tokens: List<Token>): Expression {
        if (tokens.isEmpty()) {
            throw Exception("input should not be empty")
        }
        val que = ArrayDeque(tokens)
        return parseExpression(que)
    }

    private fun parseExpression(que: ArrayDeque<Token>): Expression {
        val left = parseNumber(que.removeFirst())
        if (que.firstOrNull()?.type == Type.PLUS) {
            return parseBiOperator(left, que.removeFirst(), que)
        }
        return left
    }

    private fun parseBiOperator(left: Expression, op: Token, que: ArrayDeque<Token>): Expression {
        val right = parseExpression(que)
        return Plus(left, right)
    }

    private fun parseNumber(number: Token): Number {
        return Number(number)
    }
}