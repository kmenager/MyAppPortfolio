package io.github.kmenager.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.spotify) Button mSpotify;
    @InjectView(R.id.scores_app) Button mScores;
    @InjectView(R.id.library_app) Button mLibrary;
    @InjectView(R.id.build_it_bigger) Button mBuildIt;
    @InjectView(R.id.bacon_reader) Button mBacon;
    @InjectView(R.id.capstone) Button mCapstone;

    protected View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button button = (Button)v;
            String message = getString(R.string.message_toast, button.getText().toString());
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        mSpotify.setOnClickListener(mOnClickListener);
        mScores.setOnClickListener(mOnClickListener);
        mLibrary.setOnClickListener(mOnClickListener);
        mBuildIt.setOnClickListener(mOnClickListener);
        mBacon.setOnClickListener(mOnClickListener);
        mCapstone.setOnClickListener(mOnClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
