package com.example.emailclone;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView emailListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        emailListView = findViewById(R.id.emailListView);

        ArrayList<EmailModel> emailList = new ArrayList<>();
        emailList.add(new EmailModel("John Doe", "Meeting Tomorrow", "Don't forget our meeting at 10 AM."));
        emailList.add(new EmailModel("SpamBot", "Win a Million!", "Congratulations, you’ve won!"));

        EmailAdapter adapter = new EmailAdapter(this, emailList);
        emailListView.setAdapter(adapter);
    }
}
