package com.example.tmsandroid

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration_window)

        passwordLengthCheck()
    }

    private fun passwordLengthCheck() {
        val button = findViewById<Button>(R.id.button)

        val toSecondActivity = Intent(this, SecondActivity::class.java)
        val passwordText = findViewById<EditText>(R.id.inputPassword)

        passwordText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // This method is called to notify you that, within s, the count characters beginning at start are about to be replaced by new text with length after.
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // This method is called to notify you that, within s, the count characters beginning at start have just replaced old text that had length before.
            }

            override fun afterTextChanged(s: Editable?) {
                // This method is called to notify you that, somewhere within s, the text has been changed.
                val passwordLength = passwordText.text.length
                button.isEnabled = false

                if (passwordLength > 8) {
                    button.isEnabled = true
                    button.setOnClickListener {
                        startActivity(toSecondActivity)
                        onStop()
                    }
                }
            }
        })
    }
}
