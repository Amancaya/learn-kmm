package com.example.learnkmm.translate.data.local

import com.example.learnkmm.database.TranslateDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DatabaseDriverFactory {
    actual fun create(): SqlDriver {
        return NativeSqliteDriver(
            TranslateDatabase.Schema,
            "translate.db"
        )
    }
}