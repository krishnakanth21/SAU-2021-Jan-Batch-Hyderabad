import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CalculatorCompComponent } from './calculator-comp.component';

describe('CalculatorCompComponent', () => {
  let component: CalculatorCompComponent;
  let fixture: ComponentFixture<CalculatorCompComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CalculatorCompComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CalculatorCompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
