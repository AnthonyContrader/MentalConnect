import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ElixirmapComponent } from './elixirmap.component';

describe('ElixirmapComponent', () => {
  let component: ElixirmapComponent;
  let fixture: ComponentFixture<ElixirmapComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ElixirmapComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ElixirmapComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
