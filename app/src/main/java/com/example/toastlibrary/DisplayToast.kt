package com.example.toastlibrary

import android.content.Context
import android.widget.Toast

object DisplayToast {
    fun show(context: Context){
        Toast.makeText(context,"My Library",Toast.LENGTH_SHORT).show()
    }
}