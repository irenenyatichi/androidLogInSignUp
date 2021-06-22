package com.example.assignment_register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var etEmail: EditText
    lateinit var etPassword: EditText
    lateinit var btnSubmit: Button
    lateinit var btnSignUp:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        signUp()

    }
    fun castViews(){
    etEmail = findViewById(R.id.etEmail)
    etPassword = findViewById(R.id.etPassword)
    btnSubmit = findViewById(R.id.btnSubmit)
    btnSignUp = findViewById(R.id.btnSignUp)
    btnSubmit.setOnClickListener {
        Toast.makeText(baseContext,"You have successfully signed into your account" , Toast.LENGTH_LONG).show()
    }
    }
    fun signUp() {
        btnSubmit.setOnClickListener {
            var email = etEmail.text.toString()
            if (email.isEmpty()) {
                etEmail.setError("Required!")
            }
            var password = etPassword.text.toString()
            if (password.isEmpty()) {
                etPassword.setError("Required!")
            } else {
                Toast.makeText(baseContext, "You have successfully signed up!", Toast.LENGTH_LONG).show()
            }
        }
        logIn()
    }
    fun logIn() {
        btnSignUp = findViewById(R.id.btnSignUp)
        btnSignUp.setOnClickListener {
            var intent1 = Intent(baseContext, MainActivity2::class.java)
            startActivity(intent1)
        }
    }


}