import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {
   constructor(private service: UserService) { }

  ngOnInit() {
  }

  addProducts(form: NgForm) {
    this.service.addProduct(form.value).subscribe(data => {
      console.log(form.value);
     }, err => {
      console.log(err);
    }, () => {
      console.log('dataposted successfully');
    });
  }
}
