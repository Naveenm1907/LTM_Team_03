import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms';

import { AccountComponent } from '../app/bank/components/account/account.component';
import { CustomersComponent } from '../app/bank/components/customer/customer.component';
import { TransactionComponent } from '../app/bank/components/transaction/transaction.component';

describe('Reactive Form Components', () => {
  let accountComponent: AccountComponent;
  let accountFixture: ComponentFixture<AccountComponent>;
  let customerComponent: CustomersComponent;
  let customerFixture: ComponentFixture<CustomersComponent>;
  let transactionComponent: TransactionComponent;
  let transactionFixture: ComponentFixture<TransactionComponent>;
  beforeEach(() => {

    TestBed.configureTestingModule({
      imports: [
        ReactiveFormsModule
      ]
    });

    accountFixture = TestBed.createComponent(AccountComponent);
    accountComponent = accountFixture.componentInstance;

    customerFixture = TestBed.createComponent(CustomersComponent);
    customerComponent = customerFixture.componentInstance;

    transactionFixture = TestBed.createComponent(TransactionComponent);
    transactionComponent = transactionFixture.componentInstance;

    accountComponent.ngOnInit();
    customerComponent.ngOnInit();
    transactionComponent.ngOnInit();
  });

  it('should create account form with required controls', () => {

    expect(accountComponent.accountForm).toBeTruthy();

    expect(accountComponent.accountForm.contains('account_id'))
      .toBeTrue();

    expect(accountComponent.accountForm.contains('customer_id'))
      .toBeTrue();

    expect(accountComponent.accountForm.contains('balance'))
      .toBeTrue();

    expect(accountComponent.accountForm.get('customer_id')?.hasError('required'))
      .toBeTrue();

    expect(accountComponent.accountForm.get('balance')?.hasError('required'))
      .toBeTrue();
  });

  it('should create customer form with required controls', () => {

    expect(customerComponent.customerForm).toBeTruthy();

    expect(customerComponent.customerForm.contains('name'))
      .toBeTrue();

    expect(customerComponent.customerForm.contains('email'))
      .toBeTrue();

    expect(customerComponent.customerForm.contains('username'))
      .toBeTrue();

    expect(customerComponent.customerForm.contains('password'))
      .toBeTrue();

    expect(customerComponent.customerForm.get('name')?.hasError('required'))
      .toBeTrue();

    expect(customerComponent.customerForm.get('email')?.hasError('required'))
      .toBeTrue();
  });

  it('should create transaction form with required controls', () => {

    expect(transactionComponent.transactionForm).toBeTruthy();

    expect(transactionComponent.transactionForm.contains('accountId'))
      .toBeTrue();

    expect(transactionComponent.transactionForm.contains('transactionType'))
      .toBeTrue();

    expect(transactionComponent.transactionForm.contains('amount'))
      .toBeTrue();

    expect(transactionComponent.transactionForm.contains('transactionDate'))
      .toBeTrue();

    expect(transactionComponent.transactionForm.get('accountId')?.hasError('required'))
      .toBeTrue();

    expect(transactionComponent.transactionForm.get('transactionType')?.hasError('required'))
      .toBeTrue();

    expect(transactionComponent.transactionForm.get('amount')?.hasError('required'))
      .toBeTrue();
  });

  it('should validate transaction amount as non-negative', () => {

    const amountControl =
      transactionComponent.transactionForm.get('amount');

    amountControl?.setValue(-100);

    expect(amountControl?.valid).toBeFalse();

    expect(amountControl?.hasError('min')).toBeTrue();

    amountControl?.setValue(1000);

    expect(amountControl?.valid).toBeTrue();
  });

});