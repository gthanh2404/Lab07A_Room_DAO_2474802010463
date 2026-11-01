package com.example.lab07a.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * (Bonus) Room database holder. Room's KSP compiler only generates and
 * validates the DAO implementation (including SQL queries) when the DAO is
 * attached to a @Database, so this class lets the build verify Lab 07A.
 */
@Database(entities = [ProductEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun productDao(): ProductDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "product_database"
                ).build().also { INSTANCE = it }
            }
    }
}
