package top.moverco.sunshine;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuzongxiang on 2016/12/20.
 */

public class ForecastAdapter extends BaseAdapter {
    List<ForecastBean> forecastItem = new ArrayList<ForecastBean>();
    @Override
    public int getCount() {
        return forecastItem.size();
    }

    @Override
    public Object getItem(int position) {
        return (ForecastBean)forecastItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ForecastBean forecastItem = (ForecastBean) getItem(position);



    }
}
