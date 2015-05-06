package com.example.androidmidterm;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

	public class TraceActivity extends Activity {

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			Log.i("Tracer","On Create Executed");
		}	

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.tracer, menu);
			return true;
		}

		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			// Handle action bar item clicks here. The action bar will
			// automatically handle clicks on the Home/Up button, so long
			// as you specify a parent activity in AndroidManifest.xml.
			int id = item.getItemId();
			if (id == R.id.action_settings) {
				return true;
			}
			return super.onOptionsItemSelected(item);
		}
		@Override
		protected void onStart(){
			super.onStart();
			Log.i("Tracer", "On Start Executed");	
		}
		@Override 
		protected void onResume(){
			super.onResume();
			Log.i("Tracer", "On Resume Executed");
		}
		@Override
		protected void onPause(){
			super.onPause();
			Log.i("Tracer", "On Pause Executed");
		}
		@Override 
		protected void onRestart(){
			super.onRestart();
			Log.i("Tracer", "On Restart Executed");
		}	
		@Override
		protected void onStop(){
			super.onStop();
			Log.i("Tracer", "On Stop Executed");
		}
		@Override
		protected void onDestroy(){
			super.onDestroy();
			Log.i("Tracer", "On Destroy Executed");
		}	
}
