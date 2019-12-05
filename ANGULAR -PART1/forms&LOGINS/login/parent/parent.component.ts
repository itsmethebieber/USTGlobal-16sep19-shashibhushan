import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  selectedCar;
  cars = [
    {
      imgUrl : 'https://image.shutterstock.com/image-photo/blue-compact-suv-car-sport-260nw-764866978.jpg',
      name : 'Audi'
    },
    {
      imgUrl : 'https://image.shutterstock.com/image-photo/woman-traveler-sitting-on-hatchback-260nw-517237099.jpg',
      name : 'BMW'
    },
    {
      imgUrl : 'https://image.shutterstock.com/image-photo/cars-sale-stock-row-car-260nw-636632101.jpg',
      name : 'Nano'
    },
    {
      imgUrl : 'https://image.shutterstock.com/image-photo/woman-traveler-sitting-on-hatchback-260nw-517237099.jpg',
      name : 'XYZ'
    }
  ];

  constructor() { }

  ngOnInit() {
  }

  sendCar(car) {
    this.selectedCar = car;
    console.log(car);

  }

}
