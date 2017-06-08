package com.example.logonrm.democadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    public  static final int REQUEST_NOVO_USUARIO = 1;

    @BindView(R.id.etUsername)
    EditText etUsername;

    @BindView(R.id.etSenha)
    EditText etSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);


        if(savedInstanceState != null){
            etUsername
                    .setText(savedInstanceState.getString("TEXTO"));
        }


    }

    @OnClick(R.id.tvNovoUsuario)
    public void novoUsuarioClick(){
        Intent novoUsuario = new Intent( this, NovoUsuarioActivity.class);
        startActivityForResult(novoUsuario,REQUEST_NOVO_USUARIO);
    }

    @Override
    protected void onActivityResult(int requestCode,
                                    int resultCode,
                                    Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQUEST_NOVO_USUARIO:
                etUsername.setText(data.getStringExtra("USERNAME"));
                break;
        }
    }

}
