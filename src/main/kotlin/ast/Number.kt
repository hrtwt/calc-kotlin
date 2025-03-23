package org.hrtwt.ast

import org.hrtwt.ExpressionVisitor
import org.hrtwt.Token

data class Number(val token: Token) : Expression {
    override fun accept(visitor: ExpressionVisitor) {
        return visitor.visit(this)
    }
}
