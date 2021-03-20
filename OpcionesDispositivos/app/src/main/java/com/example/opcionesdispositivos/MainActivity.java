package com.example.opcionesdispositivos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Opcion[] datos;
    private RecyclerView recView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buscamos en el layout el RecyclerView
        recView = (RecyclerView) findViewById(R.id.RecView);

        // Indicamos que el tamaño del RecyclerView no cambia
        recView.setHasFixedSize(true);

        // Definimos las opciones en el vector
        datos = new Opcion[6];
        datos[0] = new Opcion(R.drawable.tv,"Televisión", false);
        datos[1] = new Opcion(R.drawable.smartphone, "SmartPhone", false);
        datos[2] = new Opcion(R.drawable.tablet, "Tablet", false);
        datos[3] = new Opcion(R.drawable.pc, "Ordenador fijo", false);
        datos[4] = new Opcion(R.drawable.portatil, "Ordenador portátil", false);
        datos[5] = new Opcion(R.drawable.smartwatch, "SmartWatch", false);

        //Creamos el adaptador que se usa para mostrar las opciones del listado
        final AdaptadorOpciones adaptador = new AdaptadorOpciones(datos);

        // Definimos el evento onClick del adaptador
        adaptador.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // Usamos el resultado de "getChildAdapterPosition()" para saber
                // la posicion de la opcion sobre la que el usuario ha hecho click.
                if (!datos[recView.getChildAdapterPosition(v)].isCheck()){
                    datos[recView.getChildAdapterPosition(v)].setCheck(true);
                    CheckBox cb = v.findViewById(R.id.check);
                    cb.setChecked(true);
                }else{
                    datos[recView.getChildAdapterPosition(v)].setCheck(false);
                    CheckBox cb = v.findViewById(R.id.check);
                    cb.setChecked(false);
                }
            }
        });

        // Asignamos el adaptador al RecyclerView para que sepa cómo dibujar el listado de opciones
        recView.setAdapter(adaptador);

        // Muy importante indicar el tipo de Layout. ¡Obligatorio!!!
        recView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

        // Animador de la lista
        recView.setItemAnimator(new DefaultItemAnimator());

        // Creacion del boton y evento del mismo
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Creamos un array para almacenar los datos seleccionados
                ArrayList seleccionados = new ArrayList();
                String mensaje = "Has seleccionado:\n";
                // Recogemos los datos
                for (int i = 0 ; i < 6 ; i++){
                    if (datos[i].isCheck()){
                        seleccionados.add(datos[i].getTitulo());
                    }
                }
                // Si el array está vacio (no hay ninguna seleccion) muestra mensaje toast
                // Si ha seleccionado alguna opción, muestra el nombre de las opciones seleccionadas
                if(seleccionados.isEmpty()){
                    Toast.makeText(getBaseContext(), "No has seleccionado ninguna opción", Toast.LENGTH_SHORT).show();
                }else{
                    for (int i = 0 ; i < seleccionados.size() ; i++){
                        mensaje += "\n" + seleccionados.get(i);
                    }
                    Toast.makeText(getBaseContext(), mensaje, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}