package com.example.android_u2_tema2_imgenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void imageloader(View view) {
    startActivity(new Intent(this, MiImageLoader.class));
  }

  public void picaso(View view) {
    startActivity(new Intent(this, MiPicasso.class));
  }
}
