package co.personal.exampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import co.personal.exampleapp.room.TaskEntity
import co.personal.exampleapp.room.TasksDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    companion object{

        lateinit var database: TasksDatabase
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        database = Room.databaseBuilder(this, TasksDatabase::class.java, "tasks-db").build()

        GlobalScope.launch {

            database.taskDao().insertUsers(TaskEntity(1,"Prueba",true))

        }


    }


}