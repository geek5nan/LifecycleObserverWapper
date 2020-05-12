package com.devwu.lifecycle.observer_wapper;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;


/**
 * Created by Wu Nan at 2020/5/12 2:19 PM
 * <p>
 * contact: geek5nan@gmail.com
 */
public class LifecycleObserverOnResume extends LifecycleObserverInternal {

    public LifecycleObserverOnResume(LifecycleEventLambda lambda) {
        super(lambda);
    }

    @Override
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onEventEmit() {
        super.onEventEmit();
    }

}