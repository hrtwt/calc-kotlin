package org.hrtwt.ast

import org.hrtwt.ExpressionVisitor

sealed interface Expression {
    fun accept(visitor: ExpressionVisitor)
}