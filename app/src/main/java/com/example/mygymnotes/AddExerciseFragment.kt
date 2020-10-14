package com.example.mygymnotes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.mygymnotes.databinding.FragmentAddExerciseBinding
import com.example.mygymnotes.databinding.FragmentEditWorkoutBinding

class AddExerciseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentAddExerciseBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_add_exercise, container, false)

        //Išsaugo pratimą
        binding.saveExercise.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_addExerciseFragment_to_editWorkoutFragment)
        )

        return binding.root
    }
}