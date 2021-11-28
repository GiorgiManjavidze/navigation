package com.example.navigation.fragments

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigation.R

class fragmentThree: Fragment(R.layout.fragment_three) {

    class MainActivity : AppCompatActivity() {


        private lateinit var userUsername: EditText
        private lateinit var userLastname: EditText
        private lateinit var userEmail: EditText
        private lateinit var userPassword: EditText
        private lateinit var userButton: Button


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.fragment_three)

            userEmail = findViewById(R.id.userEmail)
            userPassword = findViewById(R.id.userPassword)
            userButton = findViewById(R.id.userButton)

            userButton.setOnClickListener {


                var email = userEmail.text.toString().trim()
                var password = userPassword.text.toString().trim()



                if (email.length < 11) {
                    userEmail.error = "მეილი უნდა იყოს არანაკლებ 10 სიმბოლოსაგან შემდგარი"
                    return@setOnClickListener
                } else if (!email.contains("@gmail.com")) {
                    userEmail.error = "მეილი უნდა შეიცავდეს \"@gmail.com\""
                    return@setOnClickListener
                } else if (password.length < 8) {
                    userPassword.error = "პაროლი უნდა შეიცავდეს მინიმუმ 8 სიმბოლოს!"
                    return@setOnClickListener
                } else {
                    Toast.makeText(this, "ავტორიზაცია წარმატებით განხორციელდა", Toast.LENGTH_LONG).show()
                }
                userEmail.text.clear()
                userPassword.text.clear()
            }
        }
    }

}