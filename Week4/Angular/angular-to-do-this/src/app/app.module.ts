import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { MyListComponent } from './my-list/my-list.component';
import { ListItemComponent } from './list-item/list-item.component';


@NgModule({
  declarations: [
    AppComponent,
    MyListComponent,
    ListItemComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
