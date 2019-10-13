package com.example.a101019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private GoogleMap Mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onMapReady(GoogleMap googleMap) {
        Mapa = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng arica = new LatLng(-18, 70);
        Mapa.addMarker(new MarkerOptions().position(arica).title("Marcador en Arica"));
        Mapa.moveCamera(CameraUpdateFactory.newLatLng(arica));
    }
}
