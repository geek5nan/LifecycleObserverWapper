package com.devwu.lifecycle.observerwrapper

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.devwu.lifecycle.observer_wapper.*

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  init {
    lifecycle.addObserver(LifecycleObserverOnCreate { Log.e("MainActivity", "onCreate") })
    lifecycle.addObserver(LifecycleObserverOnStart { Log.e("MainActivity", "onStart") })
    lifecycle.addObserver(LifecycleObserverOnResume { Log.e("MainActivity", "onResume") })
    lifecycle.addObserver(LifecycleObserverOnPause { Log.e("MainActivity", "onPause") })
    lifecycle.addObserver(LifecycleObserverOnStop { Log.e("MainActivity", "onStop") })
    lifecycle.addObserver(LifecycleObserverOnDestroy { Log.e("MainActivity", "onDestroy") })
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    setSupportActionBar(toolbar)

    fab.setOnClickListener { view ->
      Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
          .setAction("Action", null).show()
    }
  }

  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    // Inflate the menu; this adds items to the action bar if it is present.
    menuInflater.inflate(R.menu.menu_main, menu)
    return true
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    return when (item.itemId) {
      R.id.action_settings -> true
      else -> super.onOptionsItemSelected(item)
    }
  }
}
