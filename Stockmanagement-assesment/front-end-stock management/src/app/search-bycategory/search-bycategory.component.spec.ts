import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchBycategoryComponent } from './search-bycategory.component';

describe('SearchBycategoryComponent', () => {
  let component: SearchBycategoryComponent;
  let fixture: ComponentFixture<SearchBycategoryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchBycategoryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchBycategoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
