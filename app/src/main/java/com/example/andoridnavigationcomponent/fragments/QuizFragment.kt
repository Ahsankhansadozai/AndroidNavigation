package com.example.andoridnavigationcomponent.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.andoridnavigationcomponent.R
import com.example.andoridnavigationcomponent.databinding.FragmentQuizBinding


class QuizFragment : Fragment() {
    private var _binding: FragmentQuizBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentQuizBinding.inflate(inflater, container, false)


        hSetOnClickListener()


        return binding.root
    }

    private fun hSetOnClickListener() {

        binding.apply {

            hGoToLostFragment.setOnClickListener {
                view?.findNavController()?.navigate(R.id.action_quizFragment2_to_lostFragment2)
            }

            hGoToWinFragment.setOnClickListener {
                view?.findNavController()?.navigate(R.id.action_quizFragment2_to_winFragment2)

            }
        }

    }

}