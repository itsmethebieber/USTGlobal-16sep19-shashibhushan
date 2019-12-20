import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  addProduct(product): Observable<any> {
    return this.http.post('http://localhost:8080/add', product);
  }
  updateProduct(product): Observable <any>{
    return this.http.put('http://localhost:8080/modify', product);
  }
  searchbyname(product): Observable <any> {
      return this.http.get(`http://localhost:8080/search-product/${product.name}`, product);
    }
    searchbycompany(product): Observable <any> {
      return this.http.get(`http://localhost:8080/search-product/${product.company}`, product);
    }
    searchbycategory(product): Observable <any> {
      return this.http.get(`http://localhost:8080/search-product/${product.category}`, product);
    }
}