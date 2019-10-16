import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';



import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';


import { LoginComponent } from './login/login.component';
import { RouterModule } from '@angular/router';


import { AddmoviesComponent } from './header/addmovies/addmovies.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    AddmoviesComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    // AppRoutingModule,
    RouterModule.forRoot([
      {path : 'login', component : LoginComponent},
      {path : 'addmovies', component : AddmoviesComponent}
    ]),
    FormsModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
