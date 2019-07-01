package ru.eyelog.abstractpatternkotlin.interfaced

class RoundClass: RCRoundDownImpl, RCRoundFlexImpl, RCRoundUpImpl {

    override fun roundDexUp(num: String): Int {
        return Integer.parseInt(num.substring(0, num.length - 1)) * 10 + 10
    }

    override fun roundDexDown(num: String): Int {
        return Integer.parseInt(num.substring(0, num.length - 1)) * 10
    }

    override fun roundDexFlex(num: String): Int {
        val FLEX_VALUE = 5

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