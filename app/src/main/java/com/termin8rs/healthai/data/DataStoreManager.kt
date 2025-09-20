package com.termin8rs.healthai.data

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

private val Context.dataStore by preferencesDataStore(name = "settings")

class DataStoreManager(private val context: Context) {
    companion object {
        val OnboardingCompleteKey = booleanPreferencesKey("onboarding_complete")
        val LoginCompleteKey = booleanPreferencesKey("login_complete")
    }

    val isOnboardingComplete = context.dataStore.data.map { preferences ->
        preferences[OnboardingCompleteKey] ?: false
    }
    val isLoginComplete = context.dataStore.data.map { preferences ->
        preferences[LoginCompleteKey] ?: false
    }

    suspend fun setOnboardingComplete(isComplete: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[OnboardingCompleteKey] = isComplete
        }
    }
    suspend fun setLoginComplete(isComplete: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[LoginCompleteKey] = isComplete
        }
    }
}