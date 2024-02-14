import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateeventsComponent } from './updateevents.component';

describe('UpdateeventsComponent', () => {
  let component: UpdateeventsComponent;
  let fixture: ComponentFixture<UpdateeventsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UpdateeventsComponent]
    });
    fixture = TestBed.createComponent(UpdateeventsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
