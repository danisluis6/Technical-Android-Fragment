package tutorial.myapplication.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import tutorial.myapplication.MainActivity;
import tutorial.myapplication.R;

/**
 * Created by vuongluis on 1/27/17.
 */

public class TitlesFragment extends Fragment{

    private static final String TAG = "TitlesFragment";

    private ListView listOfNews;
    private List<String> listNews;

    private MainActivity mainActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_header,container,false);
        // Let 's establish some wigets
        if(!establishWigets(view)) {
            Log.d(TAG, "Null pointer Exception - findViewById()");
        }else{
            if(!establishVariables()){
                Log.d(TAG, "Null pointer Exception - Don't Initialize Arraylist");
            }else{
                // Todo
                callArrayAdapterToShowData(listNews,listOfNews);
            }
        }

        establishEvent();
        return view;
    }

    private void callArrayAdapterToShowData(List<String> listNews, ListView listOfNews) {
        boolean valid =true;
        try{
            ArrayAdapter adapter = new ArrayAdapter(mainActivity,R.layout.item_list_view_1,listNews);
            listOfNews.setAdapter(adapter);
        }catch (Exception ex){
            valid = false;
            ex.printStackTrace();
        }
    }

    private boolean establishWigets(View view) {
        boolean valid = true;
        try {
            listOfNews = (ListView)view.findViewById(R.id.listViewNews);
        }catch (Exception ex){
            valid = false;
            ex.printStackTrace();
        }
        return valid;
    }

    private boolean establishVariables(){
        boolean valid = true;
        try{
            listNews = new ArrayList<>();
            listNews.add(new String("Top Stories"));
            listNews.add(new String("World"));
            listNews.add(new String("Business"));
            listNews.add(new String("Politics"));
            listNews.add(new String("Entertainment"));
            listNews.add(new String("Sports"));
            listNews.add(new String("Sci/Tech"));
            listNews.add(new String("Health"));
        }catch(Exception ex){
            valid = false;
            ex.printStackTrace();
        }
        return valid;
    }

    private void establishEvent() {
        //
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(context instanceof MainActivity){
            this.mainActivity = (MainActivity)context;
        }
    }
}
