import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ActivatedRoute, convertToParamMap } from '@angular/router';

import { CustomerarrayComponent } from '../app/bank/components/customerarray/customerarray.component';
import { CustomersampleComponent } from '../app/bank/components/customersample/customersample.component';

describe('Customer Routing Components', () => {

  let customerArrayComponent: CustomerarrayComponent;
  let customerArrayFixture: ComponentFixture<CustomerarrayComponent>;

  let customerSampleComponent: CustomersampleComponent;
  let customerSampleFixture: ComponentFixture<CustomersampleComponent>;

  beforeEach(() => {

    TestBed.configureTestingModule({
      imports: [
        CustomerarrayComponent,
        CustomersampleComponent
      ],
      providers: [
        {
          provide: ActivatedRoute,
          useValue: {
            snapshot: {
              paramMap: convertToParamMap({ id: '1' }),
              queryParamMap: convertToParamMap({ role: 'User' })
            }
          }
        }
      ]
    });

    customerArrayFixture =
      TestBed.createComponent(CustomerarrayComponent);

    customerArrayComponent =
      customerArrayFixture.componentInstance;

    customerSampleFixture =
      TestBed.createComponent(CustomersampleComponent);

    customerSampleComponent =
      customerSampleFixture.componentInstance;
  });

  it('should display View Customer Details links', () => {

    customerArrayFixture.detectChanges();

    const compiled = customerArrayFixture.nativeElement;

    const links = compiled.querySelectorAll('a');

    expect(links.length).toBe(2);
    expect(compiled.textContent)
      .toContain('View Customer Details');
  });

  it('should create route parameter and query parameter links', () => {

    customerArrayFixture.detectChanges();

    const compiled = customerArrayFixture.nativeElement;

    const links = compiled.querySelectorAll('a');

    expect(links[0].getAttribute('href'))
      .toBe('/customer/1?role=User');

    expect(links[1].getAttribute('href'))
      .toBe('/customer/2?role=Admin');
  });

  it('should read customer ID from route parameter', () => {

    customerSampleFixture.detectChanges();

    expect(customerSampleComponent.customerId)
      .toBe('1');

    expect(customerSampleComponent.customer)
      .toBeDefined();

    expect(customerSampleComponent.customer?.name)
      .toBe('John Doe');
  });

  it('should read role from query parameter', () => {

    customerSampleFixture.detectChanges();

    expect(customerSampleComponent.role)
      .toBe('User');

    const compiled = customerSampleFixture.nativeElement;

    expect(compiled.textContent)
      .toContain('Customer ID from URL: 1');

    expect(compiled.textContent)
      .toContain('Role from URL: User');
  });

});