fun main() {
    println (eval_when(Sum(Sum(Num(1), Num(2)), Num(4))))
}

fun eval_if(e: Expr) : Int {
    if (e is Num) {
        return e.value
    }
    if (e is Sum) {
        return eval_if(e.right) + eval_if(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun eval_when(e: Expr) : Int =
    when(e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val left = eval_when(e.left)
            val right = eval_when(e.right)
            println("sum: $left + $right")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }