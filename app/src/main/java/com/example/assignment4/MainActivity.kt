package com.example.assignment4

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    val c = Calendar.getInstance()
    var year = c.get(Calendar.YEAR)
    var month = c.get(Calendar.MONTH)
    var day = c.get(Calendar.DAY_OF_MONTH)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View){
        val date = findViewById<TextView>(R.id.date)
        val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{view,mYear,mMonth,mDay ->
            date.setText(""+mDay+"/"+(mMonth+1)+"/"+mYear)
        },year,month,day)

        dpd.show()
    }
}