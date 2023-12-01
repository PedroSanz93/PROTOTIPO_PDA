package com.example.prueba02;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // SPINNER
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.selecciona, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(0);

        // SCROLL
        // Obtener el array de strings desde strings.xml
        String[] datos = getResources().getStringArray(R.array.articulos);
        // Enlazar RecyclerView desde el layout
        recyclerView = findViewById(R.id.recycler_view);
        // Configurar un LinearLayoutManager para el RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Crear un ArrayAdapter para los datos y asignarlo al RecyclerView
        adapter = new ArrayAdapter<>(this, android.R.layout.activity_main, datos);
        recyclerView.setAdapter(adapter); // <----------- EL FALLO ESTA AQUI
        // LA CLASE adaptadorScroll NO SIRVE PA NA pero esta ahi pa probrar



}