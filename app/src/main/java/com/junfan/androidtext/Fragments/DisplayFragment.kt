package com.junfan.androidtext.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.junfan.androidtext.R
import kotlinx.android.synthetic.main.fragment_display.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val EMPID = "param1"
private const val NAME = "param2"
private const val EMAIL = "param3"
private const val GENDER = "param4"



class DisplayFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var param3: String? = null
    private var param4: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(EMPID)
            param2 = it.getString(NAME)
            param3 = it.getString(EMAIL)
            param4 = it.getString(GENDER)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_display, container, false)
        view.text_view_empid.text = param1.toString()
        view.text_view_name.text = param2.toString()
        view.text_view_email.text = param3.toString()
        view.text_view_gender.text = param4.toString()
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DisplayFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String, param3: String, param4: String) =
            DisplayFragment().apply {
                arguments = Bundle().apply {
                    putString(EMPID, param1)
                    putString(NAME, param2)
                    putString(EMAIL, param3)
                    putString(GENDER, param4)
                }
            }
    }
}