import { Component } from '@angular/core';
import { Preferences } from '@capacitor/preferences';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  private tenantId = "";

  constructor() {
    (async () => {
      const { value } = await Preferences.get({ key: 'TENANT_ID' });
      this.tenantId = value
    })();
  }
}
