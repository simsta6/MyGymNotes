package com.example.mygymnotes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.mygymnotes.databinding.FragmentWorkoutsBinding

class WorkoutsFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentWorkoutsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_workouts, container, false)

        binding.editWorkoutBtn.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_workoutsFragment_to_editWorkoutFragment)
            )

        binding.startWorkoutBtn.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_workoutsFragment_to_exerciseFragment)
        )

        return binding.root
    }
}