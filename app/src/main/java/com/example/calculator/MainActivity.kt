package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var etNumber:EditText
    lateinit var etNumber2:EditText
    lateinit var tvadd:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumber=findViewById(R.id.etNumber)
        etNumber2=findViewById(R.id.etNumber2)
        tvadd=findViewById(R.id.tvadd)



        btnAdd=findViewById(R.id.btnAdd)
        btnAdd.setOnClickListener {
         val firstnumb=etNumber.text.toString()
            val secondnumb=etNumber2.text.toString()

            addition(firstnumb.toInt(), secondnumb.toInt())
        }

        btnSubtract=findViewById(R.id.btnSubtract)
        btnSubtract.setOnClickListener {
            val firstnumb=etNumber.text.toString()
            val secondnumb=etNumber2.text.toString()

            subtraction(firstnumb.toInt(), secondnumb.toInt())
        }

        btnMultiply=findViewById(R.id.btnMultiply)
        btnMultiply.setOnClickListener {
            val firstnumb=etNumber.text.toString()
            val secondnumb=etNumber2.text.toString()

            multiplication(firstnumb.toInt(), secondnumb.toInt())
        }

        btnModulus=findViewById(R.id.btnModulus)
        btnModulus.setOnClickListener {
            val firstnumb=etNumber.text.toString()
            val secondnumb=etNumber2.text.toString()

            division(firstnumb.toInt(), secondnumb.toInt())
        }

    }
    fun addition(firsnumb:Int,secondnumb:Int){
        var add=firsnumb+secondnumb
        tvadd.text=add.toString()
    }
    fun subtraction(firsnumb:Int,secondnumb:Int){
        var subtract=firsnumb-secondnumb
        tvadd.text=subtract.toString()
    }
    fun multiplication(firsnumb:Int,secondnumb:Int){
        var multiply=firsnumb*secondnumb
        tvadd.text=multiply.toString()
    }
    fun division(firsnumb:Int,secondnumb:Int){
        var divide=firsnumb%secondnumb
        tvadd.text=divide.toString()
    }
}