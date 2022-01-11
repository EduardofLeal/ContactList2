package com.imediata.contactlist2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toolbar;

public class Formulario extends AppCompatActivity {

    EditText eTxtNome, eTxtEmail, eTxtSite, eTxtTelefone, eTxtEndereco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        eTxtNome = (EditText) findViewById(R.id.eTtxtNome);
        eTxtEmail = (EditText) findViewById(R.id.eTxtEmail);
        eTxtSite = (EditText) findViewById(R.id.eTxtSite);
        eTxtTelefone = (EditText) findViewById(R.id.eTxtTelefone);
        eTxtEndereco = (EditText) findViewById(R.id.eTxtEndereco);

    }

    public void mudaFoto(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(Formulario.this);
        builder.setTitle("Change or add photo");
        builder.setMessage("You can take a picture or choose one from your library!");
        builder.setPositiveButton("Library", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.setNegativeButton("Camera", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.create().show();
    }

    public void cancelaLimpa(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(Formulario.this);
        builder.setTitle("Cancel");
        builder.setMessage("Clean fields or go back to contact list?");
        builder.setPositiveButton("Clean fields", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                eTxtNome.setText("");
                eTxtEmail.setText("");
                eTxtSite.setText("");
                eTxtTelefone.setText("");
                eTxtEndereco.setText("");
            }
        });
        builder.setNegativeButton("Go to contact list", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(Formulario.this, MainActivity.class);
                startActivity(intent);
            }
        });
        builder.create().show();
    }
}