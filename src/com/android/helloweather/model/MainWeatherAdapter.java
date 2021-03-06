package com.android.helloweather.model;

import java.util.List;

import com.android.helloweather.R;
import com.android.helloweather.data.WeatherData;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainWeatherAdapter extends ArrayAdapter<WeatherData> {

	private List<WeatherData> objects;
	private Context mContext;

	public MainWeatherAdapter(Context context, int textViewResourceId, List<WeatherData> objects) {
		super(context, textViewResourceId, objects);
		this.mContext=context;
		this.objects=objects;
	}

	@Override
	public int getCount() {
		return objects.size();
	}

	@Override
	public WeatherData getItem(int position) {
		return objects.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View mView=convertView;
		if(mView==null)
		{
			LayoutInflater mInflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			mView=mInflater.inflate(R.layout.main_list_item, null);
		}
		
		WeatherData element=objects.get(position);
		if(element!=null)
		{
			ImageView weather_icon=(ImageView)mView.findViewById(R.id.weather_icon);
			TextView location=(TextView)mView.findViewById(R.id.location_text);
			TextView status=(TextView)mView.findViewById(R.id.status_text);
			TextView current=(TextView)mView.findViewById(R.id.current_text);
			
			weather_icon.setImageBitmap(element.getImage());
			location.setText(element.getLocation());
			status.setText(element.getCurrentStatus());
			current.setText(element.getCurrentTemp()+"��C");
		}
		
		return mView;
	}
}
