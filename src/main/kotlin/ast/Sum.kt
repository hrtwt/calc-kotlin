package org.hrtwt.ast

import org.hrtwt.ExpressionVisitor

data class Sum(val left: Expression, val right: Expression) : Expression {
    override fun accept(visitor: ExpressionVisitor) {
        visitor.visit(this)
    }
}