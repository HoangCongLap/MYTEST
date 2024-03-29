package com.example.mytest.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mytest.Adapters.UserAdapter;
import com.example.mytest.DbQuery;
import com.example.mytest.MyCompleteListener;
import com.example.mytest.R;

public class DetailActivity extends AppCompatActivity {

    private TextView nameTextView, emailTextView, phoneTextView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Khởi tạo các TextView
        nameTextView = findViewById(R.id.name);
        emailTextView = findViewById(R.id.email);
        phoneTextView = findViewById(R.id.sdt);

        // Lấy dữ liệu từ Intent
        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");

        // Kiểm tra nếu phone là null hoặc là chuỗi rỗng
        if (phone == null || phone.trim().isEmpty()) {
            phone = "chưa cập nhật";
        }


        // Hiển thị dữ liệu
        nameTextView.setText(name);
        emailTextView.setText(email);
        phoneTextView.setText(phone);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if(item.getItemId()== android.R.id.home){
            DetailActivity.this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
