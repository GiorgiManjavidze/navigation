package com.example.navigation.fragments

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.navigation.R


    class MainActivity : AppCompatActivity() {


        private lateinit var userUsername: EditText
        private lateinit var userLastname: EditText
        private lateinit var userEmail: EditText
        private lateinit var userPassword: EditText
        private lateinit var userButton: Button


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.fragment_four)

            userUsername = findViewById(R.id.userName)
            userLastname = findViewById(R.id.userLastname)
            userEmail = findViewById(R.id.userEmail)
            userPassword = findViewById(R.id.userPassword)
            userButton = findViewById(R.id.userButton)

            userButton.setOnClickListener {

                var username = userUsername.text.toString().trim()
                var lastname = userLastname.text.toString().trim()
                var email = userEmail.text.toString().trim()
                var password = userPassword.text.toString().trim()



                if (username.length < 2) {
                    userUsername.error = "შეიყვანეთ სახელი"
                    return@setOnClickListener
                }else if (lastname.length < 2) {
                    userUsername.error = "შეიყვანეთ გვარი"
                    return@setOnClickListener
                } else if (email.length < 11) {
                    userEmail.error = "მეილი უნდა იყოს არანაკლებ 10 სიმბოლოსაგან შემდგარი"
                    return@setOnClickListener
                } else if (!email.contains("@gmail.com")) {
                    userEmail.error = "მეილი უნდა შეიცავდეს \"@gmail.com\""
                    return@setOnClickListener
                } else if (password.length < 8) {
                    userPassword.error = "პაროლი უნდა შეიცავდეს მინიმუმ 8 სიმბოლოს!"
                    return@setOnClickListener
                } else {
                    Toast.makeText(this, "თქვენ წარმატებით დარეგისტრირდით", Toast.LENGTH_LONG).show()
                }
                userUsername.text.clear()
                userLastname.text.clear()
                userEmail.text.clear()
                userPassword.text.clear()
            }
        }


}