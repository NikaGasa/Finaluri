package com.example.midterm2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


private lateinit var name : EditText
private lateinit var surname : EditText
private lateinit var phonenumb : EditText
private lateinit var persnumb : EditText
private lateinit var Button : Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button.setOnClickListener {

            val name1 = name.text.toString()

            val surname1 = surname.text.toString()

            val phonenumbe1 = phonenumb.text.toString()

            val personalnumb = persnumb.text.toString()

            if(name1.isEmpty() or !(name1.length > 3)){
                name.error = "შეიყვანეთ სახელი სწორად"
                return@setOnClickListener
            }
            else if (surname1.isEmpty() or !(surname1.length > 5)){
                surname.error = "შეიყვანე სწორი გვარი"
                return@setOnClickListener
            }
            else if ((phonenumbe1.isEmpty()) or !(phonenumbe1.length == 9)) {
                phonenumb.error = "შეიყვანეთ ნომერი სწორად"
                return@setOnClickListener
            }
            else if (personalnumb.isEmpty() or !(personalnumb.length == 11)) {
                persnumb.error = "შეიყვანეთ სწორი პირადი ნომერი"
                return@setOnClickListener
            }
        }
    }

}
