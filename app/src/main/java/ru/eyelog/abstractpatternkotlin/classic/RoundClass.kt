package ru.eyelog.abstractpatternkotlin.classic

class RoundClass{

    private val FLEX_VALUE = 5

    // Тут простая логика.
    fun roundDexUp(num: String): Int {
        return Integer.parseInt(num.substring(0, num.length - 1)) * 10 + 10
    }

    fun roundDexDown(num: String): Int {
        return Integer.parseInt(num.substring(0, num.length - 1)) * 10
    }

    fun roundDexFlex(num: String): Int {
        val tempTail = Integer.parseInt(num.substring(num.length - 1))
        val out: Int

        if (tempTail > 0 && tempTail < FLEX_VALUE) {
            out = Integer.parseInt(num.substring(0, num.length - 1)) * 10
        } else if (tempTail >= FLEX_VALUE && tempTail <= 9) {
            out = Integer.parseInt(num.substring(0, num.length - 1)) * 10 + 10
        } else {
            // if 0
            out = Integer.parseInt(num)
        }

        return out
    }
}