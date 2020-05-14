package com.example.darkclick

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

object SaveSharedPrefernce {
    const val CHECKTHEME = "checkTheme"
    fun getSharedPreferences(ctx: Context?): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(ctx)
    }

    fun setChecktheme(context: Context?, check: Int) {
        val editor = getSharedPreferences(context).edit()
        editor.putInt(CHECKTHEME, check)
        editor.apply()
    }

    fun getChecktheme(context: Context?): Int {
        return getSharedPreferences(context)
            .getInt(CHECKTHEME, 0)
    }
}