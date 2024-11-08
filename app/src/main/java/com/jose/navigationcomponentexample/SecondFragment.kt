package com.jose.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.jose.navigationcomponentexample.databinding.FragmentSecondBinding
import com.jose.navigationcomponentexample.viewmodel.RecordViewModel
import androidx.lifecycle.ViewModel


class SecondFragment : Fragment() {


    private lateinit var binding: FragmentSecondBinding
    private val recordViewModel: RecordViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)

        binding.lifecycleOwner = this
        return binding.root
    }

}