package com.umang.colorchangingbackground

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var redSP = 0
        var redEP = 0
        var greenSP = 0
        var greenEP = 0
        var blueSP = 0
        var blueEP = 0
        var red = 0
        var green = 0
        var blue = 0


        sbRed.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(
                seekBar: SeekBar?,
                progress: Int,
                fromUser: Boolean
            ) {
                tvRedCount.text = progress.toString()
                red = progress.toString().toInt()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                if(seekBar != null) {
                    redSP = seekBar.progress
                }
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                if(seekBar != null) {
                    redEP = seekBar.progress
                }
            }

        })

        sbGreen.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(
                seekBar: SeekBar?,
                progress: Int,
                fromUser: Boolean
            ) {
                tvGreenCount.text = progress.toString()
                green = progress.toString().toInt()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                if(seekBar != null) {
                    greenSP = seekBar.progress
                }
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                if(seekBar != null) {
                    greenEP = seekBar.progress
                }
            }

        })

        sbBlue.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(
                seekBar: SeekBar?,
                progress: Int,
                fromUser: Boolean
            ) {
                tvBlueCount.text = progress.toString()
                blue = progress.toString().toInt()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                if(seekBar != null) {
                    blueSP = seekBar.progress
                }
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                if(seekBar != null) {
                    blueEP = seekBar.progress
                }
            }

        })

        btnApply.setOnClickListener {
            constraintLayout.setBackgroundColor(Color.rgb(red, green, blue))
        }
    }

}