package com.example.numerodni;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;

import java.util.InputMismatchException;

// Este no
// import android.widget.EditText;

// El componente EditTextExtendido se extiende de EditText
public class EditTextExtendido extends AppCompatEditText
{
    // Hay que reescribir siempre los constructores heredados. En este caso son tres
    public EditTextExtendido(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
    }

    public EditTextExtendido(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public EditTextExtendido(Context context)
    {
        super(context);
    }

    // Para modificar el aspecto del EditText hay que reescribir este método
    @Override
    public void onDraw(Canvas canvas)
    {
        //Invocamos al método de la superclase (EditText)
        super.onDraw(canvas);


        if (this.getText().length()==8){
            try {
                int letra = Integer.parseInt(this.getText().toString()) % 23;
                switch(letra){
                    case 0:
                        this.setText(this.getText()+" - T");
                        break;
                    case 1:
                        this.setText(this.getText()+" - R");
                        break;
                    case 2:
                        this.setText(this.getText()+" - W");
                        break;
                    case 3:
                        this.setText(this.getText()+" - A");
                        break;
                    case 4:
                        this.setText(this.getText()+" - G");
                        break;
                    case 5:
                        this.setText(this.getText()+" - M");
                        break;
                    case 6:
                        this.setText(this.getText()+" - Y");
                        break;
                    case 7:
                        this.setText(this.getText()+" - F");
                        break;
                    case 8:
                        this.setText(this.getText()+" - P");
                        break;
                    case 9:
                        this.setText(this.getText()+" - D");
                        break;
                    case 10:
                        this.setText(this.getText()+" - X");
                        break;
                    case 11:
                        this.setText(this.getText()+" - B");
                        break;
                    case 12:
                        this.setText(this.getText()+" - N");
                        break;
                    case 13:
                        this.setText(this.getText()+" - J");
                        break;
                    case 14:
                        this.setText(this.getText()+" - Z");
                        break;
                    case 15:
                        this.setText(this.getText()+" - S");
                        break;
                    case 16:
                        this.setText(this.getText()+" - Q");
                        break;
                    case 17:
                        this.setText(this.getText()+" - V");
                        break;
                    case 18:
                        this.setText(this.getText()+" - H");
                        break;
                    case 19:
                        this.setText(this.getText()+" - L");
                        break;
                    case 20:
                        this.setText(this.getText()+" - C");
                        break;
                    case 21:
                        this.setText(this.getText()+" - K");
                        break;
                    case 22:
                        this.setText(this.getText()+" - E");
                        break;
                }
            }catch(NumberFormatException nfe){
                this.setText("");
            }
        }

    }
}
