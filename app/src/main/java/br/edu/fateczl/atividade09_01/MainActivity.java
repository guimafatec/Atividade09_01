package br.edu.fateczl.atividade09_01;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    /*
     * @author: Gustavo Guimarães de Oliveira
     */
    private Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            carregaFragment(bundle);
        }
    }

    private void carregaFragment(Bundle bundle) {
        String tipoAtleta = bundle.getString("tipoAtleta");
        if (tipoAtleta.equals("juvenil")){
            fragment = new AtletaJuvenilFragment();
        }
        if (tipoAtleta.equals("senior")) {
            fragment = new AtletaSeniorFragment();
        }
        if (tipoAtleta.equals("outros")){
            fragment  = new AtletaOutrosFragment();
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        Bundle bundle = new Bundle();
        Intent intent = new Intent(this, MainActivity.class);

        if (id == R.id.idJuvenis) {
            bundle.putString("tipoAtleta", "juvenil");
            intent.putExtras(bundle);
            this.startActivity(intent);
            this.finish();
            return true;
        }
        if (id == R.id.idSeniores) {
            bundle.putString("tipoAtleta", "senior");
            intent.putExtras(bundle);
            this.startActivity(intent);
            this.finish();
            return true;
        }
        if (id == R.id.idOutros) {
            bundle.putString("tipoAtleta", "outros");
            intent.putExtras(bundle);
            this.startActivity(intent);
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}