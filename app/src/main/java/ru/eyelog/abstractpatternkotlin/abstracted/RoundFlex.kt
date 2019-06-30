package ru.eyelog.abstractpatternkotlin.abstracted

class RoundFlex : AbstractRound(){

    override fun roundIt(): String {
        val out: Int

        if (tempTail in 1 until FLEX_VALUE) {
            out = Integer.parseInt(num!!.substring(0, num!!.length - 1)) * 10
        } else if (tempTail in FLEX_VALUE..9) {
            out = Integer.parseInt(num!!.substring(0, num!!.length - 1)) * 10 + 10
        } else {
            // if 0
            out = Integer.parseInt(num)
        }

        return out.toString()
    }
}