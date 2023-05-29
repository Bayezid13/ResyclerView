package com.example.resyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.resyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    var imagesList= listOf<Images>(
       Images(
           imageName = "Ponta Delgada, Azores, Portugal",
           imageUrl = "https://images.pexels.com/photos/15759773/pexels-photo-15759773.jpeg"
       ),
        Images(
            imageName = "Strange Happenings",
            imageUrl = "https://images.pexels.com/photos/13909724/pexels-photo-13909724.jpeg"
        ),
        Images(
            imageName = "Free to use (CC0)",
            imageUrl = "https://images.pexels.com/photos/277672/pexels-photo-277672.jpeg"
        ),
        Images(
            imageName = "Sergey Platonov",
            imageUrl = "https://images.pexels.com/photos/10177843/pexels-photo-10177843.jpeg"
        ),
        Images(
            imageName = "amar sonar bnagla ami ",
            imageUrl = "https://images.pexels.com/photos/39853/woman-girl-freedom-happy-39853.jpeg"
        ),
        Images(
            imageName = "amar ciniminmi ciminita ",
            imageUrl = "https://images.pexels.com/photos/39853/woman-girl-freedom-happy-39853.jpeg"
        ),


    )
    lateinit var adapter:ImageAdapter
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter= ImageAdapter()
        adapter.submitList(imagesList)
        binding.rcvView.adapter=adapter

    }

}