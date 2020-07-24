import { Injectable } from '@angular/core';
import {  HttpClient } from '@angular/common/http';
import { Surfer } from './domain/surfer';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class ViewSurferesService {

  constructor(private http: HttpClient) { }

  public getSurfer(id: number): Observable<Surfer>{
    return this.http.get<Surfer>(`http://localhost:8080/surfers/${id}`);
  }

  public postSurfer(surfer: Surfer): Observable<Surfer>{
    return this.http.post<Surfer>("http://localhost:8080/surfers", surfer);;
  }

  public postNewSurfer(surfer: Surfer): Observable<Message>{
    return this.http.post<Message>("http://localhost:8080/addSurfer", surfer);;
  }



}
