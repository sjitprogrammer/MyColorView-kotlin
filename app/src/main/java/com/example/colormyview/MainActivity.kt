package com.example.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }

    private fun setListener() {
        val clickableView:List<View> = listOf(text_box_one,text_box_two,text_box_three,text_box_four,text_box_five,constraint_layout,
            red_button, green_button, yellow_button)

        for (item in clickableView){
            item.setOnClickListener { makeColored(it) }
        }
    }
    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.text_box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.text_box_two -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.text_box_three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.text_box_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.text_box_five -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> text_box_three.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> text_box_four.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> text_box_five.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}