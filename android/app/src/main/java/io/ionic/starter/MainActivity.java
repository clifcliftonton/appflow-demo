package io.ionic.starter;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (!BuildConfig.TENANT_ID.equals("null")) {
      // This relies on an implementation detail of the Capacitor Preferences Plugin
      SharedPreferences sharedPref = this.getSharedPreferences("CapacitorStorage", Context.MODE_PRIVATE);
      SharedPreferences.Editor editor = sharedPref.edit();
      editor.putString("TENANT_ID", BuildConfig.TENANT_ID);
      editor.commit();
    }
  }
}
