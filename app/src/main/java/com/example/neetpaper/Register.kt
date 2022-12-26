package com.example.neetpaper

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        // Go Login Activity
        textView.setOnClickListener {
            val intent = Intent(this, LoignActivity::class.java)
            startActivity(intent)
        }

// FireBase RegisterButton Click handling
        Register_button.setOnClickListener {
            // Register function Call
            val email: String = editText.text.toString()
            val password = Register_text_password.text.toString()
            if(email.isEmpty()|| password.isEmpty())return@setOnClickListener

            com.google.firebase.auth.FirebaseAuth.getInstance()
                .createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (!it.isSuccessful) {
                        Toast.makeText(
                            applicationContext,
                            "Please check Email and Password",
                            Toast.LENGTH_SHORT
                        ).show()
                        return@addOnCompleteListener
                    } else {
                        Toast.makeText(
                            applicationContext,
                            "User Register Successful",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }.addOnFailureListener{
                    Toast.makeText(this, "check email ", Toast.LENGTH_SHORT).show()
                }
            val intent=Intent(this,MainActivity::class.java)
            finish()
            startActivity(intent)

        }
    }

//FireBase Register Function
@SuppressLint("SuspiciousIndentation")
override fun onStart() {
    super.onStart()
  var  firebaseUser = FirebaseAuth.getInstance().currentUser
    if(firebaseUser!= null){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
}