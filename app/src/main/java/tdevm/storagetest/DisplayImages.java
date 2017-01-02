package tdevm.storagetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class DisplayImages extends AppCompatActivity {

    Button buttonLogMain;
    public static final String TAG = "RetreiveImagesssss";
    ImageView imageView;
    FirebaseStorage firebaseStorage = FirebaseStorage.getInstance();
     final StorageReference storageRef = firebaseStorage.getReferenceFromUrl("gs://test-storage-589c1.appspot.com");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_images);
        buttonLogMain = (Button)findViewById(R.id.btn_log_main);
        imageView = (ImageView)findViewById(R.id.iv_main);
        buttonLogMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DisplayImages.this, "LOG HONE WALA HAI", Toast.LENGTH_SHORT).show();
                final StorageReference getStorageReference = storageRef.child("36_big.jpg");
                Log.d(TAG,"Yeh Hai"+getStorageReference);
                Glide.with(DisplayImages.this).using(new FirebaseImageLoader()).load(getStorageReference).into(imageView);
            }
        });
    }
}
