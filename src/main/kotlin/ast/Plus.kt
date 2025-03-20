package org.hrtwt.ast

data class Plus(val left: Expression, val right: Expression) : Expression {}