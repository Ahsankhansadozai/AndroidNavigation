package com.example.andoridnavigationcomponent.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.andoridnavigationcomponent.R
import com.example.andoridnavigationcomponent.databinding.FragmentLostFragmentBinding


class LostFragment : Fragment() {

    private var _binding: FragmentLostFragmentBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentLostFragmentBinding.inflate(inflater, container, false)


        hSetOnClickListener()

        return binding.root
    }

    private fun hSetOnClickListener() {

        binding.hRetry.setOnClickListener {

            view?.findNavController()?.navigate(R.id.action_lostFragment2_to_quizFragment2)
        }

    }

}