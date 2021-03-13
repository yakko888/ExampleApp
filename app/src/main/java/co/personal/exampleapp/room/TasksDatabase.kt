package co.personal.exampleapp.room

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = arrayOf(TaskEntity::class),version = 1)
abstract class TasksDatabase:RoomDatabase() {

    abstract fun taskDao(): TaskDao

  /*  val MIGRATION_1_2: Migration = object : Migration(1, 2) {
        override fun migrate(database: SupportSQLiteDatabase) {

        }
    }*/


}