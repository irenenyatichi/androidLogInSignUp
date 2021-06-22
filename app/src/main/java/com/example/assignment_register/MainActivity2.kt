package com.example.assignment_register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.textfield.TextInputLayout
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var spGender: Spinner
    lateinit var tvEmailS: EditText
    lateinit var tvPhoneS: EditText
    lateinit var tvPasswordS: EditText
    lateinit var btnSubmitS: Button
    lateinit var btnLogInS: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        castViews()
    }

    fun castViews() {
        etName = findViewById(R.id.etName)
        spGender = findViewById(R.id.spGender)
        tvEmailS = findViewById(R.id.tvEmailS)
        tvPhoneS = findViewById(R.id.tvPhoneS)
        tvPasswordS = findViewById(R.id.tvPasswordS)
        btnSubmitS = findViewById(R.id.btnSubmitS)
        btnLogInS = findViewById(R.id.btnLogInS)

        var genders = arrayOf("Male", "Female", "Other")
        var gendersAdapter = ArrayAdapter(baseContext, android.R.layout.simple_spinner_item, genders)
        gendersAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter = gendersAdapter
        signUp()
    }

    fun signUp() {
        btnSubmitS.setOnClickListener {
            var name = etName.text.toString()
            if (name.isEmpty()) {
                etName.setError("Required!")
            }
            var phone = tvPhoneS.text.toString()
            if (phone.isEmpty()) {
                tvPhoneS.setError("Required!")
            }
            var password = tvPasswordS.text.toString()
            if (password.isEmpty()) {
                tvPasswordS.setError("Required!")
            } else {
                Toast.makeText(baseContext, "You have successfully created an account!", Toast.LENGTH_LONG).show()
            }
        }
        logIn()
    }

    fun logIn() {
        btnLogInS = findViewById(R.id.btnLogInS)
        btnLogInS.setOnClickListener {
            var intent1 = Intent(baseContext, MainActivity::class.java)
            startActivity(intent1)
        }
    }
}