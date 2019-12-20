import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { compileBaseDefFromMetadata } from '@angular/compiler';
import { HeaderComponent } from './header/header.component';
import { AddProductComponent } from './add-product/add-product.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { UpdateProductComponent } from './update-product/update-product.component';
import { SearchBynameComponent } from './search-byname/search-byname.component';
import { SearchBycompanyComponent } from './search-bycompany/search-bycompany.component';
import { SearchBycategoryComponent } from './search-bycategory/search-bycategory.component';
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AddProductComponent,
    UpdateProductComponent,
    SearchBynameComponent,
    SearchBycompanyComponent,
    SearchBycategoryComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
       {path: 'addproduct', component: AddProductComponent},
       {path: 'update', component: UpdateProductComponent},
       {path: 'searchbyname', component: SearchBynameComponent},
       {path: 'searchbycom', component: SearchBycompanyComponent},
       {path: 'searchbycat', component: SearchBycategoryComponent},

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
