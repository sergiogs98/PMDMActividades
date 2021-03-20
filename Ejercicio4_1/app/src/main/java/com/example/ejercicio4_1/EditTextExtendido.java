package com.example.ejercicio4_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.text.style.BackgroundColorSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;

// Este no
// import android.widget.EditText;

// El componente EditTextExtendido se extiende de EditText
public class EditTextExtendido extends AppCompatEditText
{
    private Paint pNegro;
    private Paint pBlanco;

    // Hay que reescribiremos siempre los constructores heredados. En este caso son tres
    public EditTextExtendido(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        pinceles();
    }

    public EditTextExtendido(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        pinceles();
    }

    public EditTextExtendido(Context context)
    {
        super(context);
        pinceles();
    }

    // Función que inicia las pinceles que usamos para pintar el cuadradito negro
    private void pinceles()
    {
        pNegro = new Paint(Paint.ANTI_ALIAS_FLAG);
        pNegro.setColor(Color.BLACK);
        pNegro.setStyle(Style.FILL);

        pBlanco = new Paint(Paint.ANTI_ALIAS_FLAG);
        pBlanco.setColor(Color.WHITE);
        pBlanco.setTextSize(20);
    }

    // Para modificar el aspecto del EditText hay que reescribir este método
    @Override
    public void onDraw(Canvas canvas)
    {
        //Invocamos al método de la superclase (EditText)
        super.onDraw(canvas);

        if (this.getText().toString().length() == 4){
            this.setText(this.getText().toString()+" - ");
            this.setSelection(this.getText().length());
        }
        if (this.getText().toString().length() == 11){
            this.setText(this.getText().toString()+" - ");
            this.setSelection(this.getText().length());
        }
        if (this.getText().toString().length() == 18){
            this.setText(this.getText().toString()+" - ");
            this.setSelection(this.getText().length());
        }
        if (this.getText().toString().length() == 25){
            this.setEnabled(false);
            this.setTextColor(getResources().getColor(R.color.white));
            this.setBackgroundColor(getResources().getColor(R.color.black));
        }else{
            this.setTextColor(getResources().getColor(R.color.black));
            this.setBackgroundColor(getResources().getColor(R.color.white));
        }
    }
}
