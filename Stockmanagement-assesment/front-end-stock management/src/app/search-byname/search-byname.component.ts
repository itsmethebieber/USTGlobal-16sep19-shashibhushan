import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-search-byname',
  templateUrl: './search-byname.component.html',
  styleUrls: ['./search-byname.component.css']
})
export class SearchBynameComponent implements OnInit {

  products: any;
  constructor(private service: UserService) { }

  ngOnInit() {
  }

  searchByName(form: NgForm) {
    console.log(form.value);
    this.service.searchbyname(form.value).subscribe(data => {
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
