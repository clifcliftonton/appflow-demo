package io.ionic.starter;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import io.ionic.starter.BuildConfig;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (!BuildConfig.TENANT_ID.equals("null")) {
      SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
      SharedPreferences.Editor editor = sharedPref.edit();
      editor.putString("TENANT_ID", BuildConfig.TENANT_ID);
      editor.apply();
    }
  }
}
