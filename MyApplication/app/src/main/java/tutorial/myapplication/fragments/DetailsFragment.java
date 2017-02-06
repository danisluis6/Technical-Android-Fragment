package tutorial.myapplication.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import tutorial.myapplication.MainActivity;
import tutorial.myapplication.R;

/**
 * Created by vuongluis on 1/27/17.
 */

public class DetailsFragment extends Fragment{

    private MainActivity mainActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_content,container,false);
        // Let 's establish some wigets
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(context instanceof MainActivity){
            this.mainActivity = (MainActivity)context;
        }
    }
}
