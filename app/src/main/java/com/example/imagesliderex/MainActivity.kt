package com.example.imagesliderex

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {
    //var titles= arrayListOf("one","two","three")

      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()
          var list= arrayListOf<SlideModel>()
//          var txt=findViewById<TextView>(R.id.tv)

//Get image from drawable

//        imageList.add(SlideModel(R.drawable.directbankpayment,"pic1"))
//        imageList.add(SlideModel(R.drawable.kycverification,"pic2"))
//        imageList.add(SlideModel(R.drawable.kycimage,"pic3"))


// get image from server

list.add(SlideModel("pic1"))
        imageList.add(SlideModel(" https://via.placeholder.com/150/f66b97","my book"))
       imageList.add(SlideModel("https://via.placeholder.com/150/d32776","Books"))
          imageList.add(SlideModel("https://via.placeholder.com/150/d32776","Books"))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)

    }
}