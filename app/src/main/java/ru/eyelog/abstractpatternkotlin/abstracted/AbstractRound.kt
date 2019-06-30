package ru.eyelog.abstractpatternkotlin.abstracted

abstract class AbstractRound {

    internal val FLEX_VALUE = 5

    internal var num: String? = null
    internal var tempTail: Int = 0


    // Притаскиваем сюда данные и применяем к местным переменным
    internal fun setValues(num: String) {
        this.num = num
        tempTail = Integer.parseInt(num.substring(num.length - 1))
    }

    // Этим методом пользуемся в классах наследниках.
    abstract fun roundIt(): String
}