package org.hrtwt.ast

data class Sum(val left: Expression, val right: Expression) : Expression {}