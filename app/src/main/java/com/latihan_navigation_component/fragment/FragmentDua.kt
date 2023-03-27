package com.latihan_navigation_component.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.latihan_navigation_component.R
import com.latihan_navigation_component.databinding.FragmentDuaBinding

class FragmentDua : Fragment() {

    lateinit var binding : FragmentDuaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding  = FragmentDuaBinding.inflate(layoutInflater,container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnKehalaman3.setOnClickListener{
            findNavController().navigate(R.id.action_fragmentDua_to_fragmentTiga)
        }

    }


}