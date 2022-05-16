package com.example.andoridnavigationcomponent.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.andoridnavigationcomponent.R
import com.example.andoridnavigationcomponent.databinding.FragmentQuizWelcomeBinding


class QuizWelcomeFragment : Fragment() {


    private var _binding: FragmentQuizWelcomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentQuizWelcomeBinding.inflate(inflater, container, false)



        hSetOnClickListeners()

        return binding.root
    }

    private fun hSetOnClickListeners() {
        binding.hGoToQuiz.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_quizWelcomeFragment2_to_quizFragment2)
        }

    }

}