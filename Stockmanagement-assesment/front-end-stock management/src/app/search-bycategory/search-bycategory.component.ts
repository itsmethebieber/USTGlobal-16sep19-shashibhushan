import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-search-bycategory',
  templateUrl: './search-bycategory.component.html',
  styleUrls: ['./search-bycategory.component.css']
})
export class SearchBycategoryComponent implements OnInit {

  constructor(private service: UserService) { }

  products;
  ngOnInit() {
  }

  searchByName(form: NgForm) {
    console.log(form.value);
    this.service.searchbycategory(form.value).subscribe(data => {
      this.products = data;
      console.log(data);
      form.reset();
    }, err => {
      console.log(err);
    }, () => {
      console.log('dataposted successfully');
    });
  }

}
