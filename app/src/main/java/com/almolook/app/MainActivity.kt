package com.almolook.app

import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*
import com.google.android.gms.ads.*

class MainActivity : android.app.Activity() {
    private val gold = Color.rgb(217,173,82)
    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); MobileAds.initialize(this); showHome() }
    private fun showHome() {
        val root=LinearLayout(this).apply{orientation=LinearLayout.VERTICAL;setPadding(28,30,28,18);setBackgroundColor(Color.rgb(8,13,27))}
        val title=TextView(this).apply{text="👑  الملوك";textSize=30f;setTextColor(gold);gravity=Gravity.CENTER;paddingBottom=18}
        root.addView(title)
        val intro=TextView(this).apply{text="مملكة الألعاب\n\nتطبيق الملوك جاهز للانطلاق. العب، اجمع النقاط، واستمتع.";textSize=21f;setTextColor(Color.WHITE);gravity=Gravity.CENTER;padding=20}
        root.addView(intro,LinearLayout.LayoutParams(-1,0,1f))
        val play=Button(this).apply{text="ابدأ الآن";setTextColor(Color.BLACK);setBackgroundColor(gold);setOnClickListener{Toast.makeText(context,"سيتم فتح الألعاب قريباً",Toast.LENGTH_SHORT).show()}}
        root.addView(play,LinearLayout.LayoutParams(-1,60))
        val ad=AdView(this).apply{adUnitId="ca-app-pub-3940256099942544/9214589741";setAdSize(AdSize.BANNER)}
        root.addView(ad,LinearLayout.LayoutParams(-1,-2));ad.loadAd(AdRequest.Builder().build())
        setContentView(root)
    }
}
