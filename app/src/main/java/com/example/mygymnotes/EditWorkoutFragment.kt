package com.example.mygymnotes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.mygymnotes.databinding.FragmentEditWorkoutBinding
import com.example.mygymnotes.databinding.FragmentExerciseBinding

class EditWorkoutFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentEditWorkoutBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_edit_workout, container, false)

        binding.addExerciseBtn.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_editWorkoutFragment_to_addExerciseFragment)
        )

        return binding.root
    }
}