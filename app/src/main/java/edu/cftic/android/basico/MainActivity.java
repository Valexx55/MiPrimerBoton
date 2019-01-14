package edu.cftic.android.basico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String MI_TAG_LOG = "MIAPP";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     * @param vista el botón
     */
    public void voltear (View vista)
    {
        //TODO coger el texto de la caja de entrada

        Log.d(MI_TAG_LOG, "Ha tocado el botón");
        View v = findViewById(R.id.caja_entrada);
        EditText editText = (EditText)v;
        String texto_introducido = editText.getText().toString();

        Log.d(MI_TAG_LOG, "Texto introducido " + texto_introducido);
        String texto_alreves = darLaVueltaCadena(texto_introducido);
        Log.d(MI_TAG_LOG, "Texto al revés " + texto_alreves);

        TextView caja_salida = (TextView)findViewById(R.id.caja_salida);
        caja_salida.setText(texto_alreves);
        Log.d(MI_TAG_LOG, "Caja actualizada FIN");



        //View v = findViewById(R.id.botonhola);//otra forma de acceder al boton
        //Button b2 = (Button)v;

        /*Button button = (Button)vista; //Casting de VIEW A button
        String texto_boton = button.getText().toString();//Obtengo el texto del botón
        String texto_boton_reves = darLaVueltaCadena(texto_boton);
        button.setText(texto_boton_reves);*/

    }

    /**
     * Este método recibe un String y le da la vuelta
     *
     * @param cadena_entrada el String de entrada
     * @return cadena_entrada al revés
     */
    private String darLaVueltaCadena (String cadena_entrada)
    {
        String cadena_reves = null;
        StringBuilder dato = null;

        dato = new StringBuilder(cadena_entrada);
        cadena_reves = dato.reverse().toString();

        return cadena_reves;

    }

}
