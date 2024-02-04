package com.example.nav_components

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.nav_components.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {


    private lateinit var binding : FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false)


        // Handling clicks
        binding.button.setOnClickListener(){

            // If inputName->text field is not empty and clicking submit , redirect to second fragment
            if(!TextUtils.isEmpty(binding.inputName.text.toString())){

                // making a map (key, value)
                //bundle:Map
                val bundle= bundleOf( "name" to binding.inputName.text.toString())

                //syntax to call a nav_action      (Action_id,bundle)
                it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment,bundle)
            }

            // If inputName->text field is empty , show error message
            else {
                Toast.makeText(activity,"Oops! Empty fields" , Toast.LENGTH_LONG).show()
            }

        }


        // return the root view where all views are present
        return binding.root
    }

}