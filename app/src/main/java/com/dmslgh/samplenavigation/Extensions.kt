package com.dmslgh.samplenavigation

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.toast(msg:String){
    Toast.makeText(applicationContext,msg,Toast.LENGTH_LONG).show()
}