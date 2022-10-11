package com.example.bucketlist2

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bucketlist2.databinding.FragmentUpdateBinding
import com.google.gson.reflect.TypeToken.get

class UpdateFragment : Fragment() {
private var _binding: FragmentUpdateBinding? = null
private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUpdateBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
  }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}