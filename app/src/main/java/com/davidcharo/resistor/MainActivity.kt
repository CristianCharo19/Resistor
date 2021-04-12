package com.davidcharo.resistor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.davidcharo.resistor.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    var info = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.calcuteButton.setOnClickListener {
            val spFirtsValue = mainBinding.firtsSignificantValueSpinner.selectedItem.toString()
            val spSeconValue = mainBinding.secondSignificantValueSpinner.selectedItem.toString()
            val spMultiplier = mainBinding.multiplierSpinner.selectedItem.toString()
            val spTolerance = mainBinding.toleranceSpinner.selectedItem.toString()
            firtsValue(spFirtsValue, spSeconValue, spMultiplier)
            secondValue(spSeconValue)
            multiplier(spMultiplier)
            tolerance(spTolerance)
            printInfo(info)

        }
    }

    private fun printInfo(info: String) {
        mainBinding.infoTextView.text = info

    }


    private fun firtsValue(spFirtsValue: String, spSeconValue: String, spMultiplier: String) {
        when (spFirtsValue) {
            "Black" -> {
                if (spSeconValue == "Black" && spMultiplier == "Black") {
                    info = "0"
                } else {
                    info = ""
                }
            }
            "Brown" -> {
                info = "1"
            }
            "Red" -> {
                info = "2"
            }
            "Orange" -> {
                info = "3"
            }
            "Yellow" -> {
                info = "4"
            }
            "Green" -> {
                info = "5"
            }
            "Blue" -> {
                info = "6"
            }
            "Violet" -> {
                info = "7"
            }
            "Gray" -> {
                info = "8"
            }
            "White" -> {
                info = "9"
            }
        }
    }

    private fun secondValue(spSeconValue: String) {
        when (spSeconValue) {
            "Black" -> info += "0"
            "Brown" -> info += "1"
            "Red" -> info += "2"
            "Orange" -> info += "3"
            "Yellow" -> info += "4"
            "Green" -> info += "5"
            "Blue" -> info += "6"
            "Violet" -> info += "7"
            "Gray" -> info += "8"
            "White" -> info += "9"
        }
    }

    private fun multiplier(spMultiplier: String) {
        when (spMultiplier) {
            "Black" -> info = ((info.toDouble())*Math.pow(10.toDouble(),0.toDouble())).toString()
            "Brown" -> info = ((info.toDouble())*Math.pow(10.toDouble(),1.toDouble())).toString()
            "Red" -> info = ((info.toDouble())*Math.pow(10.toDouble(),2.toDouble())).toString()
            "Orange" -> info = ((info.toDouble())*Math.pow(10.toDouble(),3.toDouble())).toString()
            "Yellow" -> info = ((info.toDouble())*Math.pow(10.toDouble(),4.toDouble())).toString()
            "Green" -> info = ((info.toDouble())*Math.pow(10.toDouble(),5.toDouble())).toString()
            "Blue" -> info = ((info.toDouble())*Math.pow(10.toDouble(),6.toDouble())).toString()
            "Violet" -> info = ((info.toDouble())*Math.pow(10.toDouble(),7.toDouble())).toString()
            "Gray" -> info = ((info.toDouble())*Math.pow(10.toDouble(),8.toDouble())).toString()
            "White" -> info = ((info.toDouble())*Math.pow(10.toDouble(),9.toDouble())).toString()
            "Gold" -> info = ((info.toDouble())*0.1).toString()
            "Silver" -> info = ((info.toDouble())*0.01).toString()
        }
    }


private fun tolerance(spTolerance: String) {
    when (spTolerance) {
        "Brown" -> info += "±1%"
        "Red" -> info += "±2%"
        "Green" -> info += "±0.5%"
        "Blue" -> info += "±0.25%"
        "Violet" -> info += "±0.1%"
        "Gray" -> info += "±0.05%"
        "Gold" -> info += "±5%"
        "Silver" -> info += "±10%"
    }
}

}

