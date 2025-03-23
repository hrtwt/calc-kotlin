package org.hrtwt

import org.hrtwt.ast.Expression
import org.hrtwt.ast.Number
import org.hrtwt.ast.Sum

class Calculator {

    fun calculate(expression: Expression): Double {
        val calculateVisitor = object : ExpressionVisitor {
            var value = 0.0
            override fun visit(expression: Number) {
                this.value = expression.token.value.toDouble()
            }

            override fun visit(expression: Sum) {
                val left = this.apply { expression.left.accept(this) }.value
                val right = this.apply { expression.right.accept(this) }.value
                value = left + right
            }
        }

        expression.accept(calculateVisitor)
        return calculateVisitor.value
    }
}