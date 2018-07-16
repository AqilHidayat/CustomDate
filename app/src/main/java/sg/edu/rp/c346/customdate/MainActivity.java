package sg.edu.rp.c346.customdate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvTodo;
    ArrayList<TodoItem> alTodoList;
    CustomAdapter caTodo;



    Calendar date1 = Calendar.getInstance();
    Calendar date2 = Calendar.getInstance();//Create a Calendar object with current date and time
//    String datetime = now.get(Calendar.DAY_OF_MONTH) + "/" +
//            (now.get(Calendar.MONTH)+1) + "/" +
//            now.get(Calendar.YEAR) + " " +
//            now.get(Calendar.HOUR_OF_DAY) + ":" +
//            now.get(Calendar.MINUTE);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTodo = findViewById(R.id.lvCustomTodo);

        alTodoList = new ArrayList<>();

        date1.set(2018, 7, 1);
        date2.set(2018, 9, 22);

        TodoItem todo1 = new TodoItem("MSA", date1);
        TodoItem todo2 = new TodoItem("Go for haircut", date2);

        alTodoList.add(todo1);
        alTodoList.add(todo2);

        caTodo = new CustomAdapter(this, R.layout.todo_item, alTodoList);

        lvTodo.setAdapter(caTodo);



    }
}
