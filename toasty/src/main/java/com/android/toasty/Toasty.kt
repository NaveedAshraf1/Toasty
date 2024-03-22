package com.android.toasty

import android.content.Context
import android.widget.Toast

/**
 * @Author: Harry
 * @Date: 8/25/2022
 */
class Toasty {

        fun simpleToast(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
        }

}