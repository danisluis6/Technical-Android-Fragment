package tutorial.myapplication.fragments;

import android.content.Context;
import android.content.Intent;
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

public class TopFragment extends Fragment{

    private EditText inputTopImageText;
    private EditText inputBottomImageText;
    private Button buttonApply;

    private MainActivity mainActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_top,container,false);

        inputTopImageText = (EditText)view.findViewById(R.id.input_top_image_text);
        inputBottomImageText = (EditText)view.findViewById(R.id.input_bottom_image_text);
        buttonApply = (Button)view.findViewById(R.id.button_apply);

        // Let 's establish some wigets
        establishEvent();

        return view;
    }

    private void establishEvent() {
        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                applyText();
            }
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(context instanceof MainActivity){
            this.mainActivity = (MainActivity)context;
        }
    }

    private void applyText() {
        String toptext = inputTopImageText.getText().toString();
        String bottomtext = inputBottomImageText.getText().toString();
        this.mainActivity.showText(toptext,bottomtext);
    }
}
