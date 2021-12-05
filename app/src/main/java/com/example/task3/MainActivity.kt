package com.example.task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
     var secretValue=Random.nextInt(0,1000)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textinput=findViewById<TextInputLayout>(R.id.inputtext)
        val buttonclick=findViewById<TextView>(R.id.clickButton)
        val displaytextview=findViewById<TextView>(R.id.displaytext)
        buttonclick.setOnClickListener {

            val enteredtext=textinput.editText?.text?.toString()?.toInt()
            if (enteredtext!! > secretValue){
               displaytextview.text= "No:) My number is smaller"
            }
            else if (enteredtext < secretValue){
                displaytextview.text="No:) My number is bigger"
            }
                else if (enteredtext == 0) {
                displaytextview.text="Enter a valid number"
            }
            else{
                displaytextview.text="You are Right!";
                secretValue=Random.nextInt(0,1000)
            }

        }

    }
}