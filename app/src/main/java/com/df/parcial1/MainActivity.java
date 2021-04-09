package com.df.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ListView lvRespuesta;
    private EditText txtNombre;
    private EditText txtCodigo;
    private EditText txtIvaSoN;
    private EditText txtDesCateg;
    private EditText txtValor;
    private Button btnIngresar;
    private Button btnCostoso;
    private Button btnBaratos;
    private Button btnPromedio;
    private ArrayAdapter<String> adaptador;
    private ArrayList<Producto> producto = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvRespuesta = findViewById(R.id.lvRspuestas);
        txtNombre = findViewById(R.id.txtNombre);
        txtCodigo = findViewById(R.id.txtCodigo);
        txtIvaSoN = findViewById(R.id.txtIvaSoN);
        txtDesCateg = findViewById(R.id.txtDesCateg);
        txtValor = findViewById(R.id.txtValor);
        btnIngresar = findViewById(R.id.btnIngresar);
        btnCostoso = findViewById(R.id.btnCostoso);
        btnBaratos = findViewById(R.id.btnBaratos);
        btnPromedio = findViewById(R.id.btnPromedio);

        btnIngresar.setOnClickListener(this);
        btnCostoso.setOnClickListener(this);
        btnBaratos.setOnClickListener(this);
        btnPromedio.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnIngresar) {
            guardarProducto();
            adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, producto);
            lvRespuesta.setAdapter(adaptador);
        }

        if (v.getId() == R.id.btnPromedio) {
            promedio();
            ArrayList<String> promedioProductos = new ArrayList<>();
            String valorPromedio = "El volor promedio de los productos es: " + "\n" + promedio();
            promedioProductos.add(valorPromedio);
            adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, promedioProductos);
            lvRespuesta.setAdapter(adaptador);
        }

        if (v.getId() == R.id.btnCostoso) {
        }
        if (v.getId() == R.id.btnBaratos) {

        }
    }

    private void guardarProducto() {
        String Nombre = txtNombre.getText().toString();
        String Codigo = txtCodigo.getText().toString();
        String IvaSoN = txtIvaSoN.getText().toString();
        String DesCateg = txtDesCateg.getText().toString();
        String Valor = txtValor.getText().toString();

        Producto persona = new Producto(Nombre, Codigo, Integer.parseInt(Valor), IvaSoN, DesCateg);
        producto.add(persona);
    }

    private void menorMayor() {
        Collections.sort(producto, new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return new Integer(o1.getValor()).compareTo(new Integer(o2.getValor()));
            }
        });
    }

    private int promedio() {
        int contador = 0;
        int valorProductos = 0;
        int promedio = 0;
        for (Producto valor : producto) {
            valorProductos += valor.getValor();
            contador++;
        }
        promedio = valorProductos / contador;
        return promedio;
    }

}