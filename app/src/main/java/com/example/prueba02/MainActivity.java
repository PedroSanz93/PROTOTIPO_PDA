package com.example.prueba02;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.prueba02.R;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // SPINNER
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapterSpinner = ArrayAdapter.createFromResource(this, R.array.selecciona, android.R.layout.simple_spinner_item);
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapterSpinner);
        spinner.setSelection(0);

        // ARTICULOS
        String[] datosArticulos = getResources().getStringArray(R.array.articulo);
        ListView listViewArticulos = findViewById(R.id.list_view_articulos);
        ArrayAdapter<String> adapterArticulos = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datosArticulos);
        listViewArticulos.setAdapter(adapterArticulos);

        // CANTIDAD
        String[] datosCantidad = getResources().getStringArray(R.array.cantidad);
        ListView listViewCantidad = findViewById(R.id.list_view_cantidad);
        ArrayAdapter<String> adapterCantidad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datosCantidad);
        listViewCantidad.setAdapter(adapterCantidad);

        // IMPORTES
        String[] datosImporte = getResources().getStringArray(R.array.importe);
        ListView listViewImporte = findViewById(R.id.list_view_importe);
        ArrayAdapter<String> adapterImporte = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datosImporte);
        listViewImporte.setAdapter(adapterImporte);

        // COMIDA
        String[] datosComida = getResources().getStringArray(R.array.comida);
        ListView listViewComida = findViewById(R.id.list_view_comida);
        ArrayAdapter<String> adapterComida = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datosComida);
        listViewComida.setAdapter(adapterComida);

        // BEBIDA
        String[] datosBebida = getResources().getStringArray(R.array.bebida);
        ListView listViewBebida = findViewById(R.id.list_view_bebida);
        ArrayAdapter<String> adapterBebida = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datosBebida);
        listViewBebida.setAdapter(adapterBebida);

    }
}