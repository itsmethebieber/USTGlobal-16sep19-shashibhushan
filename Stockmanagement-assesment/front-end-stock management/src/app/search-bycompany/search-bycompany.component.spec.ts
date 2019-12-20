import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchBycompanyComponent } from './search-bycompany.component';

describe('SearchBycompanyComponent', () => {
  let component: SearchBycompanyComponent;
  let fixture: ComponentFixture<SearchBycompanyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchBycompanyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchBycompanyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
