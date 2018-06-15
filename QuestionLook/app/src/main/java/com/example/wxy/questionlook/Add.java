package com.example.wxy.questionlook;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.support.v4.widget.ImageViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Add extends AppCompatActivity {

    public static final int TAKE_PHOTO = 1;

    private ImageView picture;

    private Uri imageUri;

    private ImageView img,showImg;

    boolean tp = true;
    String subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Intent intent = getIntent();
        subject = intent.getStringExtra("subject");
        Log.d("Add", subject);

        img= (ImageView) findViewById(R.id.picture);
        showImg= (ImageView) findViewById(R.id.picture);

        ImageButton takePhoto = (ImageButton) findViewById(R.id.take_photo);
        picture = (ImageView) findViewById(R.id.picture);
        if (tp) {
            takePhoto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // 创建File对象，用于存储拍照后的图片
                    File file= Environment.getExternalStorageDirectory();
                    File outputImage = new File(getExternalCacheDir(), file+"/"+subject+".png");
                    try {
                        if (outputImage.exists()) {
                            outputImage.delete();
                        }
                        outputImage.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (Build.VERSION.SDK_INT < 24) {
                        imageUri = Uri.fromFile(outputImage);
                    } else {
                        imageUri = FileProvider.getUriForFile(Add.this, "com.example.cameraalbumtest.fileprovider", outputImage);
                    }
                    // 启动相机程序
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
                    startActivityForResult(intent, TAKE_PHOTO);
                }
            });
        } else {
            takePhoto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    BitmapDrawable bitmapDrawable= (BitmapDrawable) img.getDrawable();
                    Bitmap bitmap= bitmapDrawable.getBitmap();
                    //拿到图片
                    File file= Environment.getExternalStorageDirectory();
                    FileOutputStream fos= null;
                    try {
                        fos = new FileOutputStream(file+"/"+subject+".png");
                        bitmap.compress(Bitmap.CompressFormat.PNG,100,fos);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }finally {
                        if(fos!=null){
                            try {
                                fos.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            });
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case TAKE_PHOTO:
                if (resultCode == RESULT_OK) {
                    try {
                        // 将拍摄的照片显示出来
                        Bitmap bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(imageUri));
                        picture.setImageBitmap(bitmap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    ImageButton savePhoto = (ImageButton) findViewById(R.id.take_photo);
                    savePhoto.setImageResource(R.drawable.save);
                    savePhoto.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            BitmapDrawable bitmapDrawable= (BitmapDrawable) img.getDrawable();
                            Bitmap bitmap= bitmapDrawable.getBitmap();
                            //拿到图片
                            File file= Environment.getExternalStorageDirectory();
                            FileOutputStream fos= null;
                            try {
                                fos = new FileOutputStream(file+"/"+subject+".png");
                                bitmap.compress(Bitmap.CompressFormat.PNG,100,fos);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            } finally {
                                if(fos!=null){
                                    try {
                                        fos.close();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            finish();
                        }
                    });
                }
                break;
            default:
                break;
        }
    }

}
