package tdevm.storagetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

import tdevm.storagetest.ui.GalleryActivity;


public class MainActivity extends AppCompatActivity {

    FloatingActionMenu floatingActionMenu;
    FloatingActionButton gallery, camera, document;
    Button getImages,goGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionMenu = (FloatingActionMenu)findViewById(R.id.float_action_menu_main);
        gallery = (FloatingActionButton)findViewById(R.id.menu_gallery);
        camera = (FloatingActionButton)findViewById(R.id.menu_camera);
        document = (FloatingActionButton)findViewById(R.id.menu_documents);
        getImages = (Button)findViewById(R.id.btn_get_image);
        goGrid = (Button)findViewById(R.id.btn_go_grid);


        goGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),GridViewImages.class);
                startActivity(i);
            }
        });

        getImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, DisplayImages.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Hua", Toast.LENGTH_SHORT).show();
            }
        });



        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),GalleryActivity.class);
                startActivity(i);
                floatingActionMenu.close(true);
            }
        });

    }
}
