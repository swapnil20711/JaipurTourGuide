package com.swapnil.jaipurguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class LocationAdapter extends ArrayAdapter {
    public LocationAdapter(Activity context, int resources, List<Location> locationsList) {
        super(context, 0, locationsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Location currentLocation = (Location) getItem(position);
        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView nameLocationTextView = (TextView) ListItemView.findViewById(R.id.nameTextView);
        nameLocationTextView.setText(currentLocation.getLocationName());
        TextView descriptionLocationTextView = (TextView) ListItemView.findViewById(R.id.descriptionTextView);
        descriptionLocationTextView.setText(currentLocation.getLocationDescription());
        TextView addressLocationTextView = (TextView) ListItemView.findViewById(R.id.addressTextView);
        addressLocationTextView.setText(currentLocation.getLocationAddress());
        TextView phoneLocationTextView = (TextView) ListItemView.findViewById(R.id.phoneTextView);
        phoneLocationTextView.setText(currentLocation.getLocationPhone());
        TextView priceLocationTextView = (TextView) ListItemView.findViewById(R.id.priceTextView);
        priceLocationTextView.setText(currentLocation.getLocationPrice() + "");
        ImageView image = (ImageView) ListItemView.findViewById(R.id.image);
        TextView timeLocationTextView = (TextView) ListItemView.findViewById(R.id.timeTextView);
        timeLocationTextView.setText(currentLocation.getLocationTime());
        image.setImageResource(currentLocation.getLocationImage());
        return ListItemView;
    }
}
