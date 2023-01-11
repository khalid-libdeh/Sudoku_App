package com.example.sudoku_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val solve = findViewById<Button>(R.id.solveBtn)
        val generate = findViewById<Button>(R.id.puzzleBtn)
        val verify = findViewById<Button>(R.id.verifyBtn)
        solve.setOnClickListener {

            val intent = Intent(this@MainActivity, SolveMode::class.java)
            startActivity(intent)
        }

        generate.setOnClickListener{
            val intent = Intent(this@MainActivity, PuzzleMode::class.java)
            startActivity(intent)
        }
        verify.setOnClickListener{
            val intent = Intent(this@MainActivity, VerifyMode::class.java)
            startActivity(intent)
        }

    }


}