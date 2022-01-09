package com.example.imperialtometric

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView =findViewById(R.id.Title)
        val textView1: TextView =findViewById(R.id.textView9)
        val textView2: TextView =findViewById(R.id.units)
        val textView3: TextView =findViewById(R.id.g1)
        val textView4: TextView =findViewById(R.id.c1)
        val textView5: TextView =findViewById(R.id.l1)
        val textView6: TextView =findViewById(R.id.k1)

        var textView7: TextView =findViewById(R.id.g2)
        var textView8: TextView =findViewById(R.id.c2)
        var textView9: TextView =findViewById(R.id.l2)
        var textView10: TextView =findViewById(R.id.k2)
        var editText: TextView = findViewById(R.id.valueX)
        val rollButton: Button = findViewById(R.id.button)

        var k:Double=1.6
        var p:Double=453.6
        var g:Double=4.5
        var i:Double=2.54

        rollButton.setOnClickListener{
            textView10.text = ((editText.text.toString().toDouble()*  k.toDouble()).toString())
            textView7.text = ((editText.text.toString().toDouble()*  p.toDouble()).toString())
            textView8.text = ((editText.text.toString().toDouble()*  i.toDouble()).toString())
            textView9.text = ((editText.text.toString().toDouble()*  g.toDouble()).toString())
        }






    }
}