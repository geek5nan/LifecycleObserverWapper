package com.devwu.lifecycle.observerwrapper

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.devwu.lifecycle.observer_wapper.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    init {
        lifecycle.addObserver(LifecycleObserverOnCreate { Log.e("FirstFragment", "onCreate") })
        lifecycle.addObserver(LifecycleObserverOnStart { Log.e("FirstFragment", "onStart") })
        lifecycle.addObserver(LifecycleObserverOnResume { Log.e("FirstFragment", "onResume") })
        lifecycle.addObserver(LifecycleObserverOnPause { Log.e("FirstFragment", "onPause") })
        lifecycle.addObserver(LifecycleObserverOnStop { Log.e("FirstFragment", "onStop") })
        lifecycle.addObserver(LifecycleObserverOnDestroy { Log.e("FirstFragment", "onDestroy") })
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycle.addObserver(LifecycleObserverOnCreate {

        })
        lifecycle.addObserver(LifecycleObserverOnDestroy {

        })
        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }
}
