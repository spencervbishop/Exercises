import { Component, OnInit, Input } from '@angular/core';
import { TaskItem } from '../domain/TaskItem';
@Component({
  selector: 'app-list-item',
  templateUrl: './list-item.component.html',
  styleUrls: ['./list-item.component.css']
})
export class ListItemComponent implements OnInit {

  @Input() item: TaskItem;
  selected: boolean = false;

  constructor() { }

  ngOnInit() {
  }

  selectMe(){
    this.selected = !this.selected;
  }

}
