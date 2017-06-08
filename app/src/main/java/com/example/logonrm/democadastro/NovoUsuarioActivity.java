package com.example.logonrm.democadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NovoUsuarioActivity extends AppCompatActivity {


    @BindView(R.id.etUsernameL)
    EditText etUsernameL;

    @BindView(R.id.etSenha)
    EditText etSenha;

    @BindView(R.id.etName)
    EditText etName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_usuario);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btCriar)
    public void criar(){

        Intent i = new Intent();

        i.putExtra("USERNAME", etUsernameL.getText().toString());
        setResult(RESULT_OK,i);
        finish();

    }
}
