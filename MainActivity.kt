package com.example.pref
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //when button is pressed, it disappears
    fun Hide (view: View){
        view.visibility = View.INVISIBLE
    }
    //when button "очистить" is pressed, all buttons appear
    fun Open (view: View) {
        if (button.visibility == INVISIBLE) button.visibility = VISIBLE
        if (button2.visibility == INVISIBLE) button2.visibility = VISIBLE
        if (button3.visibility == INVISIBLE) button3.visibility = VISIBLE
        if (button4.visibility == INVISIBLE) button4.visibility = VISIBLE
        if (button9.visibility == INVISIBLE) button9.visibility = VISIBLE
        if (button10.visibility == INVISIBLE) button10.visibility = VISIBLE
        if (button11.visibility == INVISIBLE) button11.visibility = VISIBLE
        if (button12.visibility == INVISIBLE) button12.visibility = VISIBLE
        if (button13.visibility == INVISIBLE) button13.visibility = VISIBLE
        if (button14.visibility == INVISIBLE) button14.visibility = VISIBLE
        if (button15.visibility == INVISIBLE) button15.visibility = VISIBLE
        if (button16.visibility == INVISIBLE) button16.visibility = VISIBLE
        if (button17.visibility == INVISIBLE) button17.visibility = VISIBLE
        if (button18.visibility == INVISIBLE) button18.visibility = VISIBLE
        if (button19.visibility == INVISIBLE) button19.visibility = VISIBLE
        if (button20.visibility == INVISIBLE) button20.visibility = VISIBLE
        if (button21.visibility == INVISIBLE) button21.visibility = VISIBLE
        if (button22.visibility == INVISIBLE) button22.visibility = VISIBLE
        if (button23.visibility == INVISIBLE) button23.visibility = VISIBLE
        if (button24.visibility == INVISIBLE) button24.visibility = VISIBLE
        if (button25.visibility == INVISIBLE) button25.visibility = VISIBLE
        if (button26.visibility == INVISIBLE) button26.visibility = VISIBLE
        if (button27.visibility == INVISIBLE) button27.visibility = VISIBLE
        if (button28.visibility == INVISIBLE) button28.visibility = VISIBLE
        if (button29.visibility == INVISIBLE) button29.visibility = VISIBLE
        if (button30.visibility == INVISIBLE) button30.visibility = VISIBLE
        if (button31.visibility == INVISIBLE) button31.visibility = VISIBLE
        if (button32.visibility == INVISIBLE) button32.visibility = VISIBLE
        if (button33.visibility == INVISIBLE) button33.visibility = VISIBLE
        if (button34.visibility == INVISIBLE) button34.visibility = VISIBLE
        if (button35.visibility == INVISIBLE) button35.visibility = VISIBLE
        if (button36.visibility == INVISIBLE) button36.visibility = VISIBLE
        if (button37.visibility == INVISIBLE) button37.visibility = VISIBLE
    }

}
