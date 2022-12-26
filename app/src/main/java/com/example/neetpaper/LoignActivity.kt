package com.example.neetpaper

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_loign.*
import kotlinx.android.synthetic.main.activity_register.*

class LoignActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
// ...
// Initialize Firebase Auth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_loign)
        var email=email.text.toString()
        var password=password.text.toString()

            login.setOnClickListener {
                if(!email.isEmpty() || !password.isEmpty()){
                    auth = Firebase.auth
                    auth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(this) { task ->
                            if (task.isSuccessful) {
                                var intent=Intent(applicationContext, MainActivity::class.java)

                                startActivity(intent)
                                finish()
                            } else {
                                Toast.makeText(applicationContext, "wrong email or password", Toast.LENGTH_SHORT).show()
                            }
                        }
            }
        }


    }


}