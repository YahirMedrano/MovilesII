package com.example.unit1t2


import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }
    private fun setListeners() {
        //TextView Variable
        val boxOneText = findViewById<View>(R.id.box_one_text)
        val boxTwoText = findViewById<View>(R.id.box_two_text)
        val boxThreeText = findViewById<View>(R.id.box_three_text)
        val boxFourText = findViewById<View>(R.id.box_four_text)
        val boxFiveText = findViewById<View>(R.id.box_five_text)
        //Creamos las variables de los botones y hacemos referencia a ellos
        val buttonred = findViewById<View>(R.id.btn_red)
        val buttonyellow = findViewById<View>(R.id.btn_yellow)
        val buttongreen = findViewById<View>(R.id.btn_green)

        //TextView List - Agregamos las variables de los botones
        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText
            ,buttonred, buttonyellow, buttongreen)
        //TextView click-listener
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text-> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            //Entramos a las propiedades del btn y de la box para cambiar el color al hacer click
            //Btn red
            R.id.btn_red -> { view.setBackgroundColor(Color.RED)
                val boxThreeText = findViewById<View>(R.id.box_three_text)
                boxThreeText.setBackgroundColor(Color.RED)}
            //Entramos a las propiedades del btn y de la box para cambiar el color al hacer click
            //Btn Yellow
            R.id.btn_yellow -> {view.setBackgroundColor(Color.YELLOW)
            val boxFourText = findViewById<View>(R.id.box_four_text)
            boxFourText.setBackgroundColor(Color.YELLOW)}
            //Entramos a las propiedades del btn y de la box para cambiar el color al hacer click
            //Btn Green
            R.id.btn_green -> {view.setBackgroundColor(Color.GREEN)
            val boxFiveText = findViewById<View>(R.id.box_five_text)
            boxFiveText.setBackgroundColor(Color.GREEN)}
    }
    }
}