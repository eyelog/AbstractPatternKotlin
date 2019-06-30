package ru.eyelog.abstractpatternkotlin.abstracted

class RoundDown : AbstractRound(){

    override fun roundIt(): String {
        val out = Integer.parseInt(num!!.substring(0, num!!.length - 1)) * 10
        return out.toString()
    }
}