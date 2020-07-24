import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';


import { AppComponent } from './app.component';
import { ViewSurferesComponent } from './view-surferes/view-surferes.component';
import { ViewSurferesService } from './view-surferes.service';


@NgModule({
  declarations: [
    AppComponent,
    ViewSurferesComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [ViewSurferesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
