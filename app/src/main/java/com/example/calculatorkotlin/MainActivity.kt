package com.example.calculatorkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var mValueOne : Float = 0.0f
    var mValueTwo : Float = 0.0f
    var addition = false
    var subtraction = false
    var multiplication = false
    var division = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btn_1.setOnClickListener  {
            et_showNumber.setText(et_showNumber.text.append("1"))
        }
        btn_2.setOnClickListener {
            et_showNumber.setText(et_showNumber.text.append("2"))
        }
        btn_3.setOnClickListener {
            et_showNumber.setText(et_showNumber.text.append("3"))
        }
        btn_4.setOnClickListener {
            et_showNumber.setText(et_showNumber.text.append("4"))
        }
        btn_5.setOnClickListener {
            et_showNumber.setText(et_showNumber.text.append("5"))
        }
        btn_6.setOnClickListener {
            et_showNumber.setText(et_showNumber.text.append("6"))
        }
        btn_7.setOnClickListener {
            et_showNumber.setText(et_showNumber.text.append("7"))
        }
        btn_8.setOnClickListener {
            et_showNumber.setText(et_showNumber.text.append("8"))
        }
        btn_9.setOnClickListener {
            et_showNumber.setText(et_showNumber.text.append("9"))
        }
        btn_zero.setOnClickListener {
            et_showNumber.setText(et_showNumber.text.append("0"))
        }
        btn_dot.setOnClickListener {
            et_showNumber.setText(et_showNumber.text.append("."))
            btn_dot.isClickable = false
        }
        btn_clear.setOnClickListener {
            et_showNumber.setText("")
            et_showNumber.setHint("")
        }

        btn_plus.setOnClickListener {
            if (et_showNumber.text.toString().isEmpty()) {
                et_showNumber.setText("")
                Toast.makeText(this,"Enter a number",Toast.LENGTH_SHORT).show()
                et_showNumber.setHint("")
            } else {
                mValueOne = et_showNumber.text.toString().toFloat()
                addition = true
                btn_dot.isClickable = true
                et_showNumber.setText(null)
                et_showNumber.setHint("")
            }
        }
        btn_minus.setOnClickListener {
            if (et_showNumber.text.toString().isEmpty()) {
                et_showNumber.setText("")
                Toast.makeText(this,"Enter a number",Toast.LENGTH_SHORT).show()
                et_showNumber.setHint("")
            }else{
                mValueOne = et_showNumber.text.toString().toFloat()
                subtraction = true
                btn_dot.isClickable = true
                et_showNumber.setText(null)
                et_showNumber.setHint("")
            }

        }
        btn_mul.setOnClickListener {
            if (et_showNumber.text.toString().isEmpty()) {
                et_showNumber.setText("")
                Toast.makeText(this,"Enter a number",Toast.LENGTH_SHORT).show()
                et_showNumber.setHint("")
            }else
            {
                mValueOne = et_showNumber.text.toString().toFloat()
                multiplication = true
                btn_dot.isClickable = true
                et_showNumber.setText(null)
                et_showNumber.setHint("")
            }

        }
        btn_div.setOnClickListener {
            if (et_showNumber.text.toString().isEmpty()) {
                et_showNumber.setText("")
                et_showNumber.setHint("")
                Toast.makeText(this,"Enter a number",Toast.LENGTH_SHORT).show()
            }else
            {
                mValueOne = et_showNumber.text.toString().toFloat()
                division = true
                btn_dot.isClickable = true
                et_showNumber.setText(null)
                et_showNumber.setHint("")
            }

        }

        btn_equals.setOnClickListener {

            if (!et_showNumber.text.toString().isEmpty())
            {
                mValueTwo = et_showNumber.text.toString().toFloat()
                btn_dot.isClickable = true
                if (!et_showNumber.text.toString().isEmpty())
                {
                    if(addition)
                    {
                        et_showNumber.setText((mValueOne + mValueTwo).toString())
                        addition = false
                        et_showNumber.setHint("")
                    }
                    if(subtraction)
                    {
                        et_showNumber.setText((mValueOne - mValueTwo).toString() + "")
                        subtraction = false
                        et_showNumber.setHint("")
                    }
                    if(multiplication)
                    {
                        et_showNumber.setText((mValueOne * mValueTwo).toString() + "")
                        multiplication = false
                        et_showNumber.setHint("")
                    }
                    if(division)
                    {
                        if (mValueTwo === 0.0f)
                        {
                            et_showNumber.setText("")
                            et_showNumber.setHint("Can't be divided by Zero")

                        }else
                        {
                            et_showNumber.setText((mValueOne / mValueTwo).toString() + "")
                            division = false
                            et_showNumber.setHint("")
                        }

                    }
                }else
                {
                    Toast.makeText(this,"Enter a number",Toast.LENGTH_SHORT).show()
                }

            }else{
                Toast.makeText(this,"Enter a number",Toast.LENGTH_SHORT).show()
            }



        }


    }

}
