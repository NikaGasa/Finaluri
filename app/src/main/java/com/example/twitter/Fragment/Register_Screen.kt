package com.example.twitter.Fragment

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.twitter.R

class Register_Screen: Fragment(R.layout.register_screen) {

    private lateinit var name: EditText
    private lateinit var surname: EditText
    private lateinit var Password: EditText
    private lateinit var email : EditText
    private lateinit var Password_repeat : EditText
    private lateinit var registrationbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()
        register()

    }

    private fun init(){
        Password = requireView().findViewById(R.id.Password)
        email = requireView().findViewById(R.id.email)
        Password_repeat = requireView().findViewById(R.id.Password_repeat)
        name = requireView().findViewById(R.id.name)
        surname = requireView().findViewById(R.id.surname)
        registrationbutton = requireView().findViewById(R.id.registrationbutton)

    }
    private fun register(){

        registrationbutton.setOnClickListener(){

            val email = email.text.toString()
            val Password = Password.text.toString()
            val Password_repeat = Password_repeat.text.toString()
            val name = name.text.toString()
            val surname = surname.text.toString()

            if (Password.length < 6 || !(Password.matches(".*[0123456789].*".toRegex()))){
                return@setOnClickListener
//              ar vici ratom magram toasts ver vuwer maketext-ze errors migdebs
            }else if(!(Password.matches(".*[!#$%^&*_-].*".toRegex()))){
                return@setOnClickListener
            }else if(email.isEmpty() || Password.isEmpty() || Password_repeat.isEmpty()){
                return@setOnClickListener
            }else if (Password != Password_repeat){
                return@setOnClickListener
            }

        }

        }

    }