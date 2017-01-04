package top.moverco.sunshine;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by liuzongxiang on 2016/12/20.
 */

public class ForecastAdapter extends ArrayAdapter<ForecastBean> {



    int resourceId;
    ForecastAdapter(Context mContext,int resource,List<ForecastBean> list){
        super(mContext,resource,list);

        resourceId = resource;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d("GETVIEW","GETVIEW");
        ForecastBean forecastBean = getItem(position);
        ViewHolder viewHolder;
        View view ;
        if(convertView==null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,null);

            viewHolder = new ViewHolder();
            viewHolder.date_view = (TextView) view.findViewById(R.id.date);
            viewHolder.hi_tem_view = (TextView) view.findViewById(R.id.hi_tempreture);
            viewHolder.lo_tem_view = (TextView) view.findViewById(R.id.lo_tempreture);
            viewHolder.weather_view = (TextView) view.findViewById(R.id.weather);
            viewHolder.weather_image_view = (ImageView) view.findViewById(R.id.weather_image);
            view.setTag(viewHolder);

        }else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.date_view.setText(forecastBean.getDate());
        viewHolder.weather_view.setText(forecastBean.getWeather());
        viewHolder.hi_tem_view.setText(forecastBean.getHi_tem()+"");
        viewHolder.lo_tem_view.setText(forecastBean.getLo_tem()+"");
        viewHolder.weather_image_view.setImageResource(forecastBean.getSrc());

        return view;
    }



    class ViewHolder {
        TextView date_view,weather_view,hi_tem_view,lo_tem_view;
        ImageView weather_image_view;
    }
}
