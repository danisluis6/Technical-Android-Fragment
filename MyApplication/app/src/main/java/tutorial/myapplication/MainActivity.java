package tutorial.myapplication;

import android.app.FragmentTransaction;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import tutorial.myapplication.fragments.DetailsFragment;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (isMultiPane()) {
            DetailsFragment details = (DetailsFragment) getFragmentManager().findFragmentById(R.id.details);
            if ( (details == null) || (details.getShownIndex() != index) ) {
                details = DetailsFragment.newInstance(index);
                Log.v(TAG, "about to run FragmentTransaction...");
                FragmentTransaction ft = getFragmentManager().beginTransaction();CHAPTER 8: Fragments for Tablets and More
                ft.setTransition(
                        FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.replace(R.id.details, details);
                ft.commit();
            }

    }

    public boolean isMultiPane(){
        boolean valid = true;
        try{
            this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }catch(Exception ex){
            valid = false;
        }
        return valid;
    }
}
