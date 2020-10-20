package com.example.mygymnotes.adapters.workout

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mygymnotes.R
import com.example.mygymnotes.data.Workout

class WorkoutAdapter(private val list: List<Workout>): RecyclerView.Adapter<WorkoutAdapter.WorkoutViewHolder>() {

    inner class WorkoutViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var wName: TextView? = null
        var wDate: TextView? = null

        init {
            wName = itemView.findViewById(R.id.workoutNameText)
            wDate = itemView.findViewById(R.id.lastTimeDateText)
//            itemView.setOnClickListener { view: View ->
//                val position: Int = adapterPosition
//                Toast.makeText(
//                    itemView.context,
//                    "Clicked on item ${position + 1}",
//                    Toast.LENGTH_SHORT
//                ).show()
//            }
        }

        fun bind(workout: Workout){
            wName?.text = workout.name
            wDate?.text = workout.date.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkoutViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.fragment_workouts, parent, false)
        return WorkoutViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: WorkoutViewHolder, position: Int) {
        Log.i("WorkoutFragment", "loading item")
        val workout: Workout = list[position]
        holder.bind(workout)
    }

    override fun getItemCount(): Int = list.size
}