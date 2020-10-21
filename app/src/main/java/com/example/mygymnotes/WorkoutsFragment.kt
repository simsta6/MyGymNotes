package com.example.mygymnotes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mygymnotes.adapters.workout.WorkoutAdapter
import com.example.mygymnotes.data.Workout
import com.example.mygymnotes.databinding.FragmentWorkoutsBinding
import kotlinx.android.synthetic.main.fragment_workouts.*
import java.util.*

class WorkoutsFragment : Fragment() {

    private val workouts = mutableListOf<Workout>()

    private lateinit var binding: FragmentWorkoutsBinding
    private lateinit var adapter: WorkoutAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_workouts, container, false
        )

        binding.testBtn.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_workoutsFragment_to_workoutFragment)
        )

        binding.workoutsList.adapter = WorkoutAdapter(workouts)

        postToList()

        return binding.root
    }

    private fun postToList(){
        for (i in 1..10)
            addItem(Workout("AAAAAAAA", 1999))
    }

    private fun addItem(workout: Workout){
        workouts.add(workout)
    }

}