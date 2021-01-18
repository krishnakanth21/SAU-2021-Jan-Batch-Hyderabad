import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CalculatorCompComponent } from './calculator-comp/calculator-comp.component';
import { FormTestComponent } from './form-test/form-test.component';
import { HomeCompComponent } from './home-comp/home-comp.component';
import { HttpTestComponent } from './http-test/http-test.component';

const routes: Routes = [
  
  { path: 'home', component: HomeCompComponent },
  { path: '',   redirectTo: '/home', pathMatch: 'full' },
  { path: 'calc-component', component: CalculatorCompComponent },
  { path: 'form-component', component: FormTestComponent },
  { path: 'http-component', component: HttpTestComponent },
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
