package course.labs.activitylab;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class ActivityOne extends Activity {

		// string for logcat documentation
		private final static String TAG = "Lab-ActivityOne";

		// lifecycle counts
		//TODO: Create 7 counter variables, each corresponding to a different one of the lifecycle callback methods.
		int createCounter = 0;
		int startCounter = 0;
		int resumeCounter = 0;
		int pauseCounter = 0;
		int stopCounter = 0;
		int restartCounter = 0;
		int destroyCounter = 0;

		//TODO:  increment the variables' values when their corresponding lifecycle methods get called.
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_one);
			
			//Log cat print out
			Log.i(TAG, "onCreate called");

			createCounter++;
			displayCalls();
			//TODO: update the appropriate count variable & update the view
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.activity_one, menu);
			return true;
		}
		
		// lifecycle callback overrides
		
		@Override
		public void onStart(){
			super.onStart();
			
			//Log cat print out
			Log.i(TAG, "onStart called");

			startCounter++;
			displayCalls();
			//TODO:  update the appropriate count variable & update the view

		}

	    // TODO: implement 5 missing lifecycle callback methods

		@Override
		public void onSaveInstanceState(Bundle savedInstanceState){
			//TODO:  save state information with a collection of key-value pairs & save all  count variables
		}


		public void launchActivityTwo(View view) {
			startActivity(new Intent(this, ActivityTwo.class));
		}

	@Override
	protected void onResume() {
		super.onResume();
		setContentView(R.layout.activity_one);

		//Log cat print out
		Log.i(TAG, "onResume called");

		resumeCounter++;
		displayCalls();
		//TODO: update the appropriate count variable & update the view
	}

	@Override
	protected void onPause() {
		super.onPause();
		setContentView(R.layout.activity_one);

		//Log cat print out
		Log.i(TAG, "onPause called");

		pauseCounter++;
		displayCalls();
		//TODO: update the appropriate count variable & update the view
	}

	@Override
	protected void onStop() {
		super.onStop();
		setContentView(R.layout.activity_one);

		//Log cat print out
		Log.i(TAG, "onStop called");

		stopCounter++;
		displayCalls();
		//TODO: update the appropriate count variable & update the view
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		setContentView(R.layout.activity_one);

		//Log cat print out
		Log.i(TAG, "onDestroy called");

		destroyCounter++;
		displayCalls();
		//TODO: update the appropriate count variable & update the view
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		setContentView(R.layout.activity_one);

		//Log cat print out
		Log.i(TAG, "onRestart called");

		resumeCounter++;
		displayCalls();
		//TODO: update the appropriate count variable & update the view
	}

	public void displayCalls()
	{
		((TextView)findViewById(R.id.create)).setText(getText(R.string.onCreate) + " " + createCounter);
		((TextView)findViewById(R.id.start)).setText(getText(R.string.onStart) + " " + startCounter);
		((TextView)findViewById(R.id.resume)).setText(getText(R.string.onResume) + " " + resumeCounter);
		((TextView)findViewById(R.id.pause)).setText(getText(R.string.onPause) + " " + pauseCounter);
		((TextView)findViewById(R.id.stop)).setText(getText(R.string.onStop) + " " + stopCounter);
		((TextView)findViewById(R.id.restart)).setText(getText(R.string.onRestart) + " " + restartCounter);
		((TextView)findViewById(R.id.destroy)).setText(getText(R.string.onDestroy) + " " + destroyCounter);


	}
}
