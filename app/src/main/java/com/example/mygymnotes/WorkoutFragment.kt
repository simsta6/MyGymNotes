package com.example.mygymnotes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.mygymnotes.databinding.FragmentTitleBinding
import com.example.mygymnotes.databinding.FragmentWorkoutBinding

class WorkoutFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentWorkoutBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_workout, container, false)


        binding.editWorkoutBtn.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_workoutFragment_to_editWorkoutFragment)
        )

        binding.startWorkoutBtn.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_workoutFragment_to_exerciseFragment)
        )

        return binding.root
    }

}