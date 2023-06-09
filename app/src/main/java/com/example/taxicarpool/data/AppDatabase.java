package com.example.taxicarpool.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {UserIdentity.class, Carpool.class, CarpoolUserCrossRef.class}, version = 1)
public abstract  class AppDatabase extends RoomDatabase {

    public abstract UserDao Dao();

    private static AppDatabase instance;

    public static synchronized AppDatabase getInstance(Context context) {

        if (instance == null) {
            instance = Room.inMemoryDatabaseBuilder(context.getApplicationContext(),AppDatabase.class).fallbackToDestructiveMigration().allowMainThreadQueries().build();
            instance.clearAllTables();
        }

        return instance;

    }
}
