package tutorial.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import tutorial.myapplication.fragments.BottomFragment;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private BottomFragment bottomFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)this.findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bottomFragment = (BottomFragment)this.getSupportFragmentManager().findFragmentById(R.id.bottom_fragment);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }else if(id == R.id.action_search){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void showText(String toptext, String bottomtext) {
        bottomFragment.showText(toptext,bottomtext);
    }
}
