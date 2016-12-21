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

    int resourceId;
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
            View view = LayoutInflater.from().inflate(resourceId,null);

            viewHolder = new ViewHolder();
            viewHolder.date_view = (TextView) convertView.findViewById(R.id.date);
            viewHolder.hi_tem_view = (TextView) convertView.findViewById(R.id.hi_tempreture);
            viewHolder.lo_tem_view = (TextView) convertView.findViewById(R.id.lo_tempreture);
            viewHolder.weather_view = (TextView) convertView.findViewById(R.id.weather);
            viewHolder.weather_image_view = (ImageView) convertView.findViewById(R.id.weather_image);
            view.setTag(viewHolder);
            return convertView;
        }

        return convertView;
    }
     class ViewHolder {
        TextView date_view,weather_view,hi_tem_view,lo_tem_view;
        ImageView weather_image_view;
    }
}
