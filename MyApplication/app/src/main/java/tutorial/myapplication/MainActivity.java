package tutorial.myapplication;

import android.content.pm.ActivityInfo;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import tutorial.myapplication.fragments.BusinessFragment;
import tutorial.myapplication.fragments.EntertainmentFragment;
import tutorial.myapplication.fragments.HealthFragment;
import tutorial.myapplication.fragments.PoliticsFragment;
import tutorial.myapplication.fragments.SportsFragment;
import tutorial.myapplication.fragments.TechFragment;
import tutorial.myapplication.fragments.TopStoriesFragment;
import tutorial.myapplication.fragments.WorldFragment;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private static final String TAG = "MainActivity";

    // Organization Fragment In Android
    private Fragment detailsFragment;

    private TopStoriesFragment topStoriesFragment
    private WorldFragment worldFragment;
    private BusinessFragment businessFragment;
    private PoliticsFragment politicsFragment;
    private EntertainmentFragment entertainmentFragment;
    private SportsFragment sportsFragment;
    private TechFragment techFragment;
    private HealthFragment healthFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(establishWidgetsAndroid()){
            if (isMultiPane()) {

            }
        }else{
            Log.d(TAG,"Null pointer Exception - findViewById()");
        }
    }

    private boolean establishFragmentsAndroid() {
        boolean valid = true;
        try{
            detailsFragment = new Fragment();

            topStoriesFragment = new TopStoriesFragment();
            worldFragment = new WorldFragment();
            businessFragment = new BusinessFragment();
            politicsFragment = new PoliticsFragment();
            entertainmentFragment = new EntertainmentFragment();
            sportsFragment = new SportsFragment();
            techFragment = new TechFragment();
            healthFragment = new HealthFragment();
        }catch (Exception ex){
            valid = false;
            ex.printStackTrace();
        }
        return valid;
    }

    private boolean establishWidgetsAndroid() {
        boolean valid = true;
        try{

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return valid;
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
    public void switchFragment(Fragment fragment, boolean addToBackStack, int id) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(id, fragment);
        ft.commit();
    }
}
