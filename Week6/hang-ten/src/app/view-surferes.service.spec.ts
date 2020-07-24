import { TestBed, inject } from '@angular/core/testing';

import { ViewSurferesService } from './view-surferes.service';

describe('ViewSurferesService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ViewSurferesService]
    });
  });

  it('should be created', inject([ViewSurferesService], (service: ViewSurferesService) => {
    expect(service).toBeTruthy();
  }));
});
