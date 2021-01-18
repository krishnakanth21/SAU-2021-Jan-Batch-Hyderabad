import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CalculatorServiceService {

  constructor() { }
  

  add(num1: number,num2: number){
    return num1 + num2;
  }

  sub(num1: number,num2: number){
    return num1 - num2;
  }

  mul(num1: number,num2: number){
    return num1 * num2;
  }

  div(num1: number,num2: number){
    return num1 / num2;
  }
}
