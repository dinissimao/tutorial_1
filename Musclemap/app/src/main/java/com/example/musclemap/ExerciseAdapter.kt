package com.example.musclemap

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExerciseAdapter(
    private val exerciseList: List<Exercise>,
    private val onItemClick: (Exercise) -> Unit
) : RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder>() {

    class ExerciseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageViewExercise: ImageView = itemView.findViewById(R.id.imageViewExercise)
        val textViewName: TextView = itemView.findViewById(R.id.textViewName)
        val textViewCategory: TextView = itemView.findViewById(R.id.textViewCategory)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_exercise, parent, false)
        return ExerciseViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
        val exercise = exerciseList[position]

        holder.textViewName.text = exercise.name
        holder.textViewCategory.text = exercise.category
        holder.imageViewExercise.setImageResource(exercise.imageResId)

        holder.itemView.setOnClickListener {
            onItemClick(exercise)
        }
    }

    override fun getItemCount(): Int {
        return exerciseList.size
    }
}