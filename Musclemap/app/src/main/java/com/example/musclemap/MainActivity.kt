package com.example.musclemap

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerViewExercises: RecyclerView
    private lateinit var exerciseAdapter: ExerciseAdapter
    private lateinit var exerciseList: List<Exercise>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewExercises = findViewById(R.id.recyclerViewExercises)
        recyclerViewExercises.layoutManager = LinearLayoutManager(this)

        exerciseList = listOf(
            Exercise(
                "Bench Press",
                "Chest",
                "A compound exercise that mainly targets the chest, while also working the shoulders and triceps.",
                R.drawable.bench_press
            ),
            Exercise(
                "Squat",
                "Legs",
                "A lower body exercise that targets quadriceps, glutes and hamstrings.",
                R.drawable.squat
            ),
            Exercise(
                "Deadlift",
                "Back",
                "A full body exercise with strong emphasis on the back, glutes and hamstrings.",
                R.drawable.deadlift
            ),
            Exercise(
                "Shoulder Press",
                "Shoulders",
                "An upper body exercise that focuses on the shoulder muscles and triceps.",
                R.drawable.shoulder_press
            ),
            Exercise(
                "Bicep Curl",
                "Arms",
                "An isolation exercise that targets the biceps.",
                R.drawable.bicep_curl
            ),
            Exercise(
                "Crunch",
                "Abs",
                "A core exercise that focuses on the abdominal muscles.",
                R.drawable.crunch
            )
        )

        exerciseAdapter = ExerciseAdapter(exerciseList) { selectedExercise ->
            val intent = Intent(this, ExerciseDetailActivity::class.java)
            intent.putExtra("name", selectedExercise.name)
            intent.putExtra("category", selectedExercise.category)
            intent.putExtra("description", selectedExercise.description)
            intent.putExtra("imageResId", selectedExercise.imageResId)
            startActivity(intent)
        }

        recyclerViewExercises.adapter = exerciseAdapter
    }
}