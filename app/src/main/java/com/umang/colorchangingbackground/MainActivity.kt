package com.umang.colorchangingbackground

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var redEP = 0
        var greenEP = 0
        var blueEP = 0
        var red = 0
        var green = 0
        var blue = 0

        val rColor = tvRedCount.currentTextColor
        val gColor = tvGreenCount.currentTextColor
        val bColor = tvBlueCount.currentTextColor


        sbRed.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seekBar: SeekBar?,
                progress: Int,
                fromUser: Boolean
            ) {
                tvRedCount.text = progress.toString()
                red = progress.toString().toInt()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null) {
                    var redSP = seekBar.progress
                }
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null) {
                    redEP = seekBar.progress
                }
            }

        })

        sbGreen.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seekBar: SeekBar?,
                progress: Int,
                fromUser: Boolean
            ) {
                tvGreenCount.text = progress.toString()
                green = progress.toString().toInt()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null) {
                    var greenSP = seekBar.progress
                }
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null) {
                    greenEP = seekBar.progress
                }
            }

        })

        sbBlue.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seekBar: SeekBar?,
                progress: Int,
                fromUser: Boolean
            ) {
                tvBlueCount.text = progress.toString()
                blue = progress.toString().toInt()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null) {
                    var blueSP = seekBar.progress
                }
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null) {
                    blueEP = seekBar.progress
                }
            }

        })

        btnApply.setOnClickListener {
            constraintLayout.setBackgroundColor(Color.rgb(red, green, blue))
            val avgColor = (redEP+greenEP+blueEP) / 3
            if (avgColor >= 130) {
                tvRedCount.setTextColor(Color.BLACK)
                tvGreenCount.setTextColor(Color.BLACK)
                tvBlueCount.setTextColor(Color.BLACK)
            } else {
                tvRedCount.setTextColor(rColor)
                tvGreenCount.setTextColor(gColor)
                tvBlueCount.setTextColor(bColor)
            }

        }
    }
}
