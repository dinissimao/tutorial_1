package com.example.musclemap

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ExerciseDetailActivity : AppCompatActivity() {

    private lateinit var imageViewDetail: ImageView
    private lateinit var textViewDetailName: TextView
    private lateinit var textViewDetailCategory: TextView
    private lateinit var textViewDetailDescription: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_detail)

        imageViewDetail = findViewById(R.id.imageViewDetail)
        textViewDetailName = findViewById(R.id.textViewDetailName)
        textViewDetailCategory = findViewById(R.id.textViewDetailCategory)
        textViewDetailDescription = findViewById(R.id.textViewDetailDescription)

        val name = intent.getStringExtra("name")
        val category = intent.getStringExtra("category")
        val description = intent.getStringExtra("description")
        val imageResId = intent.getIntExtra("imageResId", 0)

        textViewDetailName.text = name
        textViewDetailCategory.text = category
        textViewDetailDescription.text = description
        imageViewDetail.setImageResource(imageResId)
    }
}