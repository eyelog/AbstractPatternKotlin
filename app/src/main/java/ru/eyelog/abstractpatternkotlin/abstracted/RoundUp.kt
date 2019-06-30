package ru.eyelog.abstractpatternkotlin.abstracted

class RoundUp : AbstractRound(){

    override fun roundIt(): String {
        val out = Integer.parseInt(num!!.substring(0, num!!.length - 1)) * 10 + 10
        return out.toString()
    }
}