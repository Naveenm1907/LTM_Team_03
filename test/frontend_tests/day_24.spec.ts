import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomersampleComponent } from '../app/bank/components/customersample/customersample.component';

describe('CustomersampleComponent', () => {

  let component: CustomersampleComponent;
  let fixture: ComponentFixture<CustomersampleComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [CustomersampleComponent]
    });

    fixture = TestBed.createComponent(CustomersampleComponent);
    component = fixture.componentInstance;
  });

  it('should display customer details correctly', () => {

    fixture.detectChanges();

    const compiled = fixture.nativeElement;

    expect(compiled.textContent).toContain('Customer Details');
    expect(compiled.textContent).toContain('ID: 1');
    expect(compiled.textContent).toContain('Name: jhon');
    expect(compiled.textContent).toContain('Email: jhon@gmail.com');
    expect(compiled.textContent).toContain('Username: jhonuser');
    expect(compiled.textContent).toContain('Password: User');
    expect(compiled.textContent).toContain('Role:');
  });

  it('should display customer email when Show Email button is clicked', () => {

    fixture.detectChanges();

    const buttons = fixture.nativeElement.querySelectorAll('button');

    buttons[0].click();

    fixture.detectChanges();

    const compiled = fixture.nativeElement;

    expect(component.message).toBe('Customer Email: jhon@gmail.com');
    expect(compiled.textContent).toContain(
      'Customer Email: jhon@gmail.com'
    );
  });

  it('should change customer role to Admin when Change Role button is clicked', () => {

    fixture.detectChanges();

    const buttons = fixture.nativeElement.querySelectorAll('button');

    buttons[1].click();

    fixture.detectChanges();

    const compiled = fixture.nativeElement;

    expect(component.customer.role).toBe('Admin');
    expect(component.message).toBe(
      'Customer role changed to Admin'
    );
    expect(compiled.textContent).toContain(
      'Customer role changed to Admin'
    );
  });

});