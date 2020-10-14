package com.example.mygymnotes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.mygymnotes.databinding.FragmentSummaryBinding
import com.example.mygymnotes.databinding.FragmentTitleBinding

class SummaryFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentSummaryBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_summary, container, false)
        binding.doneSummaryBtn.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_summaryFragment_to_titleFragment)
        )

        return binding.root
    }
}