//10120201 - Ilham Ramdhan Putra Lesmana - IF5

package com.belajarkuy.tugasuas_10120201.view.activity;

/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		splash_screen
	 *	@date 		Sunday 28th of May 2023 03:40:42 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.belajarkuy.tugasuas_10120201.R;

public class splashScreenActivity extends Activity {

	
	private View _bg__splash_screen_ek2;
	private View tombolmulai;
	private TextView labelmulai;
	private ImageView __img_gambar1;
	private TextView selamat_datang_di_tulis;
	private TextView melakukan_tugas_harian_dengan_tulis;
	private TextView ayo_kita_masuk_ke_catatan_harian_anda;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);

		
		_bg__splash_screen_ek2 = (View) findViewById(R.id._bg__splash_screen_ek2);
		tombolmulai = (Button) findViewById(R.id.tombolmulai);
		__img_gambar1 = (ImageView) findViewById(R.id.__img_gambar1);
		selamat_datang_di_tulis = (TextView) findViewById(R.id.selamat_datang_di_tulis);
		melakukan_tugas_harian_dengan_tulis = (TextView) findViewById(R.id.melakukan_tugas_harian_dengan_tulis);
		ayo_kita_masuk_ke_catatan_harian_anda = (TextView) findViewById(R.id.ayo_kita_masuk_ke_catatan_harian_anda);
	
		
		//custom code goes here
		tombolmulai.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(splashScreenActivity.this, MainActivity.class);
				startActivity(intent);
			}
		});
	}
}
	
	