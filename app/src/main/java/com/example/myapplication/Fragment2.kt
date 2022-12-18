package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {
    private lateinit var infoTextView: TextView
    private lateinit var poasImageView: ImageView
    private lateinit var poasDescriptions: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment2, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        infoTextView = view.findViewById(R.id.textView)
        poasImageView = view.findViewById(R.id.imageView)
        poasDescriptions = resources.getStringArray(R.array.poas)
    }
    fun setDescription(buttonIndex: Int) {
        val description: String = poasDescriptions[buttonIndex]
        infoTextView.text = description
        when (buttonIndex) {
            1 -> poasImageView.setImageResource(R.drawable.brim)
            2 -> poasImageView.setImageResource(R.drawable.cha)
            3 -> poasImageView.setImageResource(R.drawable.raze)
        }
    }

}