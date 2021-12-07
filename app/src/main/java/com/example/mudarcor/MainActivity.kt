package com.example.mudarcor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cboCor.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val id = v.id
        if(id == R.id.cboCor){
            mudarCor()
        }
    }

     private fun mudarCor(){
        if(cboCor.isChecked){
            imgPrincipal.setColorFilter(resources.getColor(R.color.green))
        }else{
            imgPrincipal.setColorFilter(resources.getColor(R.color.black))
        }
    }
}