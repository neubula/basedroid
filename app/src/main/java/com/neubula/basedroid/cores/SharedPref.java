package com.neubula.basedroid.cores;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import java.util.Locale;
import java.util.Set;

public class SharedPref {

	private SharedPreferences appSharedPrefs;
	private Editor prefsEditor;

	public SharedPref(Context context) {
		this.appSharedPrefs = context.getSharedPreferences(Constants.APP_SHARED_PREFS, Activity.MODE_PRIVATE);
		this.prefsEditor = appSharedPrefs.edit();
	}
	
	public String get(String key) {
		return appSharedPrefs.getString(key.toUpperCase(Locale.US), null);
	}
	
	public void set(String key, String value) {
		prefsEditor.putString(key.toUpperCase(Locale.US), value);
		prefsEditor.commit();
	}
	
	public void unset(String key) {
		prefsEditor.putString(key.toUpperCase(Locale.US), null);
		prefsEditor.commit();
	}
	
	public int getInt(String key) {
		return appSharedPrefs.getInt(key.toUpperCase(Locale.US), 0);
	}
	
	public void setInt(String key, int value) {
		prefsEditor.putInt(key.toUpperCase(Locale.US), value);
		prefsEditor.commit();
	}
	
	public void unsetInt(String key) {
		prefsEditor.putInt(key.toUpperCase(Locale.US), 0);
		prefsEditor.commit();
	}
	
	public float getLong(String key) {
		return appSharedPrefs.getLong(key.toUpperCase(Locale.US), 0);
	}
	
	public void setLong(String key, long value) {
		prefsEditor.putLong(key.toUpperCase(Locale.US), value);
		prefsEditor.commit();
	}
	
	public void unsetLong(String key) {
		prefsEditor.putLong(key.toUpperCase(Locale.US), 0);
		prefsEditor.commit();
	}
	
	public float getFloat(String key) {
		return appSharedPrefs.getFloat(key.toUpperCase(Locale.US), 0);
	}
	
	public void setFloat(String key, float value) {
		prefsEditor.putFloat(key.toUpperCase(Locale.US), value);
		prefsEditor.commit();
	}
	
	public void unsetFloat(String key) {
		prefsEditor.putFloat(key.toUpperCase(Locale.US), 0);
		prefsEditor.commit();
	}
	
	public boolean getBoolean(String key) {
		return appSharedPrefs.getBoolean(key.toUpperCase(Locale.US), false);
	}
	
	public void setBoolean(String key, boolean value) {
		prefsEditor.putBoolean(key.toUpperCase(Locale.US), value);
		prefsEditor.commit();
	}
	
	public void unsetBoolean(String key) {
		prefsEditor.putBoolean(key.toUpperCase(Locale.US), false);
		prefsEditor.commit();
	}
	
	/**
	 * 
	 * @param key
	 * @return Set&lt;String&gt; 
	 * <br>Default value: null
	 */
	public Set<String> getSet(String key) {
		return appSharedPrefs.getStringSet(key.toUpperCase(Locale.US), null);
	}
	
	public void setSet(String key, Set<String> values) {
		prefsEditor.putStringSet(key.toUpperCase(Locale.US), values);
		prefsEditor.commit();
	}
	
	public void unsetSet(String key) {
		prefsEditor.putStringSet(key.toUpperCase(Locale.US), null);
		prefsEditor.commit();
	}

	public void clearPref() {
		prefsEditor.clear();
		prefsEditor.commit();
	}

}