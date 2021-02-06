package co.personal.exampleapp.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface TaskDao {

    @Query("Select *FROM task_entity")
    fun getAllTask():MutableList<TaskEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUsers(taskEntity: TaskEntity)


}