import { NONE_TYPE } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';


export interface UserData {
  firstName: string;
  lastName: string;
  ph: string;
  Email: string;
}
@Component({
  selector: 'app-form-test',
  templateUrl: './form-test.component.html',
  styleUrls: ['./form-test.component.css']
})
export class FormTestComponent implements OnInit {

  constructor() { }
  profileForm = new FormGroup({
    firstName: new FormControl(''),
    lastName: new FormControl(''),
    ph: new FormControl(''),
    Email: new FormControl(''),
  });

 

  prof : any;
  headers =  ['firstName', 'lastName','ph', 'Email'];
  names = ['firstName', 'lastName','ph', 'Email'];
  rows : Array<UserData> = [];

  onSubmit() {
    console.warn(this.profileForm.value);
    sessionStorage.setItem(this.profileForm.value["firstName"],JSON.stringify(this.profileForm.value));
  }
  sortByKey(array: any[], key: string | number) {
    return array.sort(function(a, b) {
        var x = a[key]; var y = b[key];
        return ((x < y) ? -1 : ((x > y) ? 1 : 0));
    });
    }

  display(){
    this.rows = [];
    for (const [key, value] of Object.entries(sessionStorage)) {
      this.prof = sessionStorage.getItem(key);
      this.prof = JSON.parse(this.prof);
      this.rows.push(this.prof);  
  };
  console.log(this.rows);
  console.log(this.sortByKey(this.rows,"ph"));
  }

  
  ngOnInit(): void {
  }

}
