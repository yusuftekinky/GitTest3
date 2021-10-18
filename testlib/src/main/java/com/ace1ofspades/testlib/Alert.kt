package com.ace1ofspades.testlib

import android.app.AlertDialog
import android.content.Context

object Alert {
    fun showMessage(context:Context) {
        AlertDialog.Builder(context)
            .setTitle("title")
            .setMessage("Message")
            .show()
    }
}