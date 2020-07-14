package com.example.myplace.ui.terms

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.myplace.R
import com.example.myplace.ui.terms.TermsViewModel

class TermsFragment : Fragment() {


    private lateinit var termsViewModel: TermsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        this.activity?.title = "Terminos"
        termsViewModel =
            ViewModelProviders.of(this).get(termsViewModel::class.java)
        val root = inflater.inflate(R.layout.freagment_terminos, container, false)

        return root
    }
}