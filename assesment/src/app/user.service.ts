import { Injectable } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
// import { userInfo } from 'os';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  fireBaseURL = 'https://ust-global-aa80d.firebaseio.com/';
  constructor(private http: HttpClient) { }

  postUser(data: NgForm) {
    console.log('service:', data);
    return this.http.post(`${this.fireBaseURL}/users.json`, data);
  }

  getUsers() {
    return this.http.get(`${this.fireBaseURL}/users.json`).pipe(
      map(data => {
        const newArray = [];
        // tslint:disable-next-line: forin
        for (const key in data) {
          newArray.push({...data[key], id : key});
        }
        return newArray;
      })
    );
  }

  updateUser(id, data) {
    return this.http.put(`${this.fireBaseURL}/users/${id}.json`, data);
  }

  deleteUsers(id) {
    return this.http.delete(`${this.fireBaseURL}/users/${id}.json`);
  }

}
