package tdevm.storagetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import tdevm.storagetest.adapter.GridAdapter;

public class GridViewImages extends AppCompatActivity {

    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_images);
        gridView = (GridView)findViewById(R.id.grid_view_main);
        gridView.setAdapter(new GridAdapter(GridViewImages.this));
    }
}


