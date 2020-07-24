import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewSurferesComponent } from './view-surferes.component';

describe('ViewSurferesComponent', () => {
  let component: ViewSurferesComponent;
  let fixture: ComponentFixture<ViewSurferesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewSurferesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewSurferesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
