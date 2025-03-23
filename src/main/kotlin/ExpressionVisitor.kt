package org.hrtwt

import org.hrtwt.ast.Number
import org.hrtwt.ast.Sum

interface ExpressionVisitor {
    fun visit(expression: Number)
    fun visit(expression: Sum)
}