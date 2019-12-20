import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-search-bycompany',
  templateUrl: './search-bycompany.component.html',
  styleUrls: ['./search-bycompany.component.css']
})
export class SearchBycompanyComponent implements OnInit {

  constructor(private service: UserService) { }

  products;
  ngOnInit() {
  }

  searchByName(form: NgForm) {
    console.log(form.value);
    this.service.searchbycompany(form.value).subscribe(data => {
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
