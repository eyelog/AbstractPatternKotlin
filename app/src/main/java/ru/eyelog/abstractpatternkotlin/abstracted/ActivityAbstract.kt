package ru.eyelog.abstractpatternkotlin.abstracted

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.sand_box.*
import ru.eyelog.abstractpatternkotlin.R

class ActivityAbstract : AppCompatActivity(){

    // Более легкие и стройные абстрактные классы
    val roundDown = RoundDown()
    val roundFlex = RoundFlex()
    val roundUp = RoundUp()

    private var position: Int = 0
    private var outLine: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sand_box)

        spinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                setPosition(position)
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                setPosition(0)
            }
        })

        btCount.setOnClickListener { v ->
            if (etIn.getText().toString() != "" && Integer.parseInt(etIn.getText().toString()) > 9) {
                when (position) {
                    0 -> {
                        roundDown.setValues(etIn.text.toString())
                        outLine = roundDown.roundIt()
                    }
                    1 -> {
                        roundFlex.setValues(etIn.text.toString())
                        outLine = roundFlex.roundIt()
                    }
                    2 -> {
                        roundUp.setValues(etIn.text.toString())
                        outLine = roundUp.roundIt()
                    }
                    else -> outLine = "Чёт не так =("
                }
                tvOut.setText(outLine)
            } else {
                etIn.setError("Пусто! Либо мало.")
            }
        }
    }

    private fun setPosition(position: Int) {
        this.position = position
    }
}