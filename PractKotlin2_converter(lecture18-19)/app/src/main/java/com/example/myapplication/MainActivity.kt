package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText:EditText=findViewById(R.id.editTextCurrencyRate)
        editText.requestFocus()

    }
    fun convertButton_Click(view:View) {
    val editText:EditText=findViewById(R.id.editTextCurrencyRate)
    val editText1:EditText=findViewById(R.id.editTextSum)
    val textView4:TextView=findViewById(R.id.textView4)
        if(editText.text.isEmpty())
        {
            val toast1:Toast= Toast.makeText(applicationContext, "Введите курс обмена!",Toast.LENGTH_SHORT)
            toast1.show()
            editText.requestFocus()
        }
        else if (editText1.text.isEmpty())
        {
            val toast2:Toast=Toast.makeText(applicationContext,"Введите сумму для обмена!",Toast.LENGTH_SHORT)
            toast2.show()
            editText1.requestFocus()
        }
        else
        {
            val res:Double=editText.text.toString().toDouble()*editText1.text.toString().toDouble()
            textView4.text="${res.toString()}"
        }
    }


}