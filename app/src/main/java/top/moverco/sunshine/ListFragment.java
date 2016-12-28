package top.moverco.sunshine;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by liuzongxiang on 2016/12/20.
 */

public class ListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.listfragment,container,false);
        return view;

    }
//    private class Task extends AsyncTask<URL,Integer,Long>{
//
//        @Override
//        protected Long doInBackground(URL... params) {
//            HttpURLConnection httpURLConnection = new HttpURLConnection() {
//                @Override
//                public void disconnect() {
//
//                }
//
//                @Override
//                public boolean usingProxy() {
//                    return false;
//                }
//
//                @Override
//                public void connect() throws IOException {
//
//                }
//            }
//            return null;
//        }
//    }

}
