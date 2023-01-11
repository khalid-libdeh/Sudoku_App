package com.example.sudoku_app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.gridlayout.widget.GridLayout


class SolveMode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_solve_mode)

        val sudokuArray = IntArray(81)
        val editTextList = ArrayList<EditText>()
        val grid = findViewById<GridLayout>(R.id.sudoku)
        for (i in 0 until grid.childCount) {
            if (grid.getChildAt(i) is EditText) {
                editTextList.add(grid.getChildAt(i) as EditText)
            }
        }
        confirm(editTextList)

    }

     fun confirm(arr: ArrayList<EditText>) {
        val confirm = findViewById<Button>(R.id.confirmBtn)
        //

        var test = findViewById<TextView>(R.id.test)
        confirm.setOnClickListener {
            var output=""
            for(i in 0 until arr.size ){
                output += arr[i].text.toString()

              }


            test.text = output
        }
    }
}

