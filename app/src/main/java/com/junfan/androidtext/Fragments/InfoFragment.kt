package com.junfan.androidtext.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.junfan.androidtext.R
import kotlinx.android.synthetic.main.fragment_info.view.*

class InfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_info, container, false)

        view.button_send.setOnClickListener {
            var empid = view.edit_text_empid.text.toString()
            var name = view.edit_text_name.text.toString()
            var email = view.edit_text_email.text.toString()
            var gender = view.edit_text_gender.text.toString()

            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragment_container, DisplayFragment.newInstance(empid,name,email,gender)).commit()
        }

        return view
    }


}