package com.devwu.lifecycle.observer_wapper;

import androidx.lifecycle.LifecycleObserver;


/**
 * Created by Wu Nan at 2020/5/12 2:38 PM
 * <p>
 * contact: geek5nan@gmail.com
 */
class LifecycleObserverInternal implements LifecycleObserver {

    private LifecycleEventLambda lifecycleEventLambda;

    LifecycleObserverInternal(LifecycleEventLambda lambda) {
        this.lifecycleEventLambda = lambda;
    }

    void onEventEmit() {
        lifecycleEventLambda.onEventLambda();
    }
}