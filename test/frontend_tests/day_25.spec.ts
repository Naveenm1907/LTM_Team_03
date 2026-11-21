import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerarrayComponent } from '../app/bank/components/customerarray/customerarray.component';

describe('CustomerarrayComponent', () => {

  let component: CustomerarrayComponent;
  let fixture: ComponentFixture<CustomerarrayComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: []
    });

    fixture = TestBed.createComponent(CustomerarrayComponent);
    component = fixture.componentInstance;
  });

  it('should use uppercase, lowercase and titlecase pipes correctly', () => {

    fixture.detectChanges();

    const compiled = fixture.nativeElement;

    // uppercase pipe
    expect(compiled.textContent).toContain('Name: JOHN DOE');
    expect(compiled.textContent).toContain('Role: USER');

    // lowercase pipe
    expect(compiled.textContent).toContain('Email: john@example.com');

    // titlecase pipe
    expect(compiled.textContent).toContain('Username: John_Doe');
  });

  it('should use json pipe to display customer object', () => {

    fixture.detectChanges();

    const compiled = fixture.nativeElement;

    expect(compiled.textContent).toContain('Customer Object:');

    expect(compiled.textContent).toContain('"name":"John Doe"');
    expect(compiled.textContent).toContain('"email":"john@example.com"');
    expect(compiled.textContent).toContain('"customerId":"1"');
  });

});