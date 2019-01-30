package ru.eyelog.abstractpatternkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import ru.eyelog.abstractpatternkotlin.classic.ClassicActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btClassic.setOnClickListener {
            val intent = Intent(this@MainActivity, ClassicActivity::class.java)
            startActivity(intent)
        }
    }
}
