import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchBynameComponent } from './search-byname.component';

describe('SearchBynameComponent', () => {
  let component: SearchBynameComponent;
  let fixture: ComponentFixture<SearchBynameComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchBynameComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchBynameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
