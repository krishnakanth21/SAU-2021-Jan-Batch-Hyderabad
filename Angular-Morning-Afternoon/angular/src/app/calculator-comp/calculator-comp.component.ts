import { Component, OnInit } from '@angular/core';
import { CalculatorServiceService } from '../services/calculator-service.service';
@Component({
  selector: 'app-calculator-comp',
  templateUrl: './calculator-comp.component.html',
  styleUrls: ['./calculator-comp.component.css']
})
export class CalculatorCompComponent implements OnInit {

  constructor(private calc:CalculatorServiceService){

  }
  title = 'simple-calculator';
  num1 = "";
  num2 = "";
  result = 0;



addition(){
  this.result = this.calc.add(parseInt(this.num1),parseInt(this.num2));
}
subtraction(){
  this.result = this.calc.sub(parseInt(this.num1),parseInt(this.num2));
}
multiply(){
  this.result = this.calc.mul(parseInt(this.num1),parseInt(this.num2));
}
divide(){
  this.result = this.calc.div(parseInt(this.num1),parseInt(this.num2));
}

  ngOnInit(): void {
  }

}
