package co.personal.exampleapp

import android.system.Os.close
import androidx.room.Room
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import co.personal.exampleapp.room.TasksDatabase
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class MigrationTest {
   /* private val TEST_DB = "migration-test"

    // Array of all migrations
    private val ALL_MIGRATIONS = arrayOf(
        MIGRATION_1_2, MIGRATION_2_3, MIGRATION_3_4)

    @Rule
    val helper: MigrationTestHelper = MigrationTestHelper(
        InstrumentationRegistry.getInstrumentation(),
        TasksDatabase::class.java.canonicalName,
        FrameworkSQLiteOpenHelperFactory()
    )

    @Test
    @Throws(IOException::class)
    fun migrateAll() {
        // Create earliest version of the database.
        helper.createDatabase(TEST_DB, 1).apply {
            close()
        }

        // Open latest version of the database. Room will validate the schema
        // once all migrations execute.
        Room.databaseBuilder(
            InstrumentationRegistry.getInstrumentation().getTargetContext(),
            TasksDatabase.class,
                    TEST_DB
        ).addMigrations(*ALL_MIGRATIONS).build().apply {
            getOpenHelper().getWritableDatabase()
            close()
        }
    }*/
}