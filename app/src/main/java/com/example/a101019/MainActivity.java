package com.example.a101019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap Mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    public void onMapReady(GoogleMap googleMap) {
        Mapa = googleMap;

        //Añadir marcador en Arica y mover la cámara.
        LatLng arica = new LatLng(-18.4745998, -70.2979202);
        Mapa.addMarker(new MarkerOptions().position(arica).title("Marcador en Arica"));
        Mapa.moveCamera(CameraUpdateFactory.newLatLng(arica));
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
