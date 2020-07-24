import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserComponent } from './user.component';
import { DataService } from '../shared/data.service';
import { HttpClient } from 'selenium-webdriver/http';

describe('UserComponent', () => {

  class MockService {
    getDetails(){}
  }
  // let component: UserComponent;
  // let fixture: ComponentFixture<UserComponent>;

  // beforeEach(async(() => {
  //   TestBed.configureTestingModule({
  //     declarations: [ UserComponent ]
  //   })
  //   .compileComponents();
  // }));

  // beforeEach(() => {
  //   fixture = TestBed.createComponent(UserComponent);
  //   component = fixture.componentInstance;
  //   fixture.detectChanges();
  // });

  // it('should create', () => {
  //   expect(component).toBeTruthy();
  // });
  let component;
  let fixture;
  let dataService: DataService;
  let mockClient;

  beforeEach(()=>{
    mockClient = jasmine.createSpyObj('HttpClient', ['get', 'put', 'post', 'delete']);
    TestBed.configureTestingModule({
      declarations:[UserComponent], 
      providers:[
        {provider: DataService, useClass: MockService},
        {provider: HttpClient, useValue: mockClient}
      ]
    })
    .compileComponents();


    fixture = TestBed.createComponent(UserComponent);
    component = fixture.debugElement.componentInstance;
    dataService = TestBed.get(DataService);
    mockClient = TestBed.get(HttpClient);
    fixture.detectChanges();
  });


  it('should create the component', ()=>{
    expect(component).toBeTruthy();
  });

  it('should not display the username if the user is not logged in',()=>{
    fixture.detectChanges();
    let compiled = fixture.nativeElement;
    expect(compiled.querySelector('p').textContent).not.toContain(component.user.name);
    
  });

  it('should display the username if the user is logged in', () =>{
    component.isLoggedIn = true;
    fixture.detectChanges();

    let compiled = fixture.nativeElement;
    expect(compiled.querySelector('p').textContent).toContain(component.user.name);
  });

  it('should fetch data async', async(() =>{
    let dataService = fixture.debugElement.injector.get(DataService);

    let spy = spyOn(dataService, 'getDetails')
    .and.returnValue(Promise.resolve('Data'));

    fixture.detectChanges();

    fixture.whenStable().then(()=>{
      expect(component.data).toBe('Data');
    })
  }));

  it('should make the get request')
});
