package top.moverco.sunshine.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import top.moverco.sunshine.R;
import top.moverco.sunshine.adapter.ForecastAdapter;
import top.moverco.sunshine.bean.ForecastBean;

/**
 * Created by liuzongxiang on 2016/12/20.
 */

public class ListFragment extends Fragment {
    private static final String JSON_DIR = "http://bulk.openweathermap.org/sample/city.list.json.gz";
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

    private void sendRequestForHttpURLConnection(){


        new Thread(new Runnable() {
            @Override
            public void run() {
                HttpURLConnection httpURLConnection = null;
                String url_str;
                URL url = null;
                try {
                    url = new URL(JSON_DIR);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                try {
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    InputStream inputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
