package top.moverco.sunshine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by liuzongxiang on 2016/12/20.
 */

public class ForecastAdapter extends BaseAdapter {
    List<ForecastBean> forecastItem = new ArrayList<ForecastBean>();
    LayoutInflater layoutInflater;
    ForecastAdapter(Context mContext){
        this.layoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return forecastItem.size();
    }

    @Override
    public ForecastBean getItem(int position) {
        return forecastItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){

        }


    }
     class ViewHolder {
        TextView date_view,weather_view,hi_tem_view,lo_tem_view;
        ImageView weather_image_view;
    }
}
