package top.moverco.sunshine;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuzongxiang on 2016/12/20.
 */

public class ListFragment extends Fragment {
    List<ForecastBean> item= new ArrayList<ForecastBean>();
    private ListView listView;
    ForecastBean forecastBean = new ForecastBean();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.listfragment,container,false);
        item = addForecastInstance();
        listView = (ListView) view.findViewById(R.id.list_item);
        listView.setAdapter(new ForecastAdapter(getActivity(),R.layout.list_item_forecast,item));
        Log.d("TAG","Create Fragment View");
        return view;

    }

    private List<ForecastBean> addForecastInstance(){
        List<ForecastBean> list = new ArrayList<ForecastBean>();
        for (int i = 0; i < 10;i++){
            forecastBean.setDate("2017-01-04");
            forecastBean.setWeather("Sunny");
            forecastBean.setHi_tem(99);
            forecastBean.setLo_tem(99);
            forecastBean.setSrc(R.mipmap.ic_launcher);
            list.add(forecastBean);
            Log.d("TAG","addForecastInstance");
        }
        return list;
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
