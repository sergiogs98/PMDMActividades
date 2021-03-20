package com.example.opcionesdispositivos;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

// Clase que se usa para definir las opciones del listado del ListActivity
public class Opcion {
	// Cada opción tiene un título y un icono
	private String titulo;
	private int icono;
	private boolean check;

	public Opcion(int icono, String titulo, boolean check) {
		this.titulo = titulo;
		this.icono = icono;
		this.check = check;
	}

	// Definimos los getters y setters de la clase
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getIcono() {
		return icono;
	}

	public void setIcono(int icono) {
		this.icono = icono;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}
}


