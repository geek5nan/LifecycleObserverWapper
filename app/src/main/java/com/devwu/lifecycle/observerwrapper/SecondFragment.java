package com.devwu.lifecycle.observerwrapper;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.fragment.NavHostFragment;

import com.devwu.lifecycle.observer_wapper.LifecycleObserverOnCreate;
import com.devwu.lifecycle.observer_wapper.LifecycleObserverOnDestroy;
import com.devwu.lifecycle.observer_wapper.LifecycleObserverOnPause;
import com.devwu.lifecycle.observer_wapper.LifecycleObserverOnResume;
import com.devwu.lifecycle.observer_wapper.LifecycleObserverOnStart;
import com.devwu.lifecycle.observer_wapper.LifecycleObserverOnStop;

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
public class SecondFragment extends Fragment {

    public SecondFragment() {
        super();
        getLifecycle().addObserver(new LifecycleObserverOnCreate(() -> Log.e("SecondFragment", "onCreate")));
        getLifecycle().addObserver(new LifecycleObserverOnStart(() -> Log.e("SecondFragment", "onStart")));
        getLifecycle().addObserver(new LifecycleObserverOnResume(() -> Log.e("SecondFragment", "onResume")));
        getLifecycle().addObserver(new LifecycleObserverOnPause(() -> Log.e("SecondFragment", "onPause")));
        getLifecycle().addObserver(new LifecycleObserverOnStop(() -> Log.e("SecondFragment", "onStop")));
        getLifecycle().addObserver(new LifecycleObserverOnDestroy(() -> Log.e("SecondFragment", "onDestroy")));
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.button_second).setOnClickListener(v ->
                NavHostFragment.findNavController(this).navigate(R.id.action_SecondFragment_to_FirstFragment));
    }
}
