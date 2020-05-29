import { TestBed } from '@angular/core/testing';

import { ElixirmapService } from './elixirmap.service';

describe('ElixirmapService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ElixirmapService = TestBed.get(ElixirmapService);
    expect(service).toBeTruthy();
  });
});
