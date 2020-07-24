import { Component, OnInit } from '@angular/core';
import { Surfer } from '../domain/surfer';
import { ViewSurferesService } from '../view-surferes.service';

@Component({
  selector: 'app-view-surferes',
  templateUrl: './view-surferes.component.html',
  styleUrls: ['./view-surferes.component.css']
})
export class ViewSurferesComponent implements OnInit {

  newsurfer: Surfer;
  existing : Surfer;
  constructor(private surferService: ViewSurferesService) { 
  }

  ngOnInit() {

      this.surferService.postSurfer(new Surfer("Paul Fox", 45))
      .subscribe((data) => {
        this.newsurfer = data;
        },
      error => {
        console.log(error);
      });

      this.surferService.getSurfer(1)
      .subscribe((data) => { 
        this.existing = data;
      },
      error => {
        console.log(error);
      }
    )};

}
