package tutorial.myapplication;

import android.content.pm.ActivityInfo;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private static final String TAG = "MainActivity";

    // Organization Fragment In Android
    private Fragment detailsFragment;

    private boolean isInitFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initial fragment
        if(establishFragmentsAndroid()){
            detailsFragment = new Fragment();

        }

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
}
