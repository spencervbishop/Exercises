import { Component, OnInit } from '@angular/core';
import { TaskItem } from '..domain/TaskItem';

@Component({
  selector: 'app-my-list',
  templateUrl: './my-list.component.html',
  styleUrls: ['./my-list.component.css']
})
export class MyListComponent implements OnInit {

  items: TaskItem[]= [
    {text: "Wash the Deathstar"}, 
    {text: "Execute all Jedi"}, 
    {text: "Conquer the galaxy"}
  ];

  selectedItems: TaskItem[] = [];
  constructor() { }

  ngOnInit() {
  }

  selectItem(item: {}){
    let find = this.selectedItems.find(i=>{
      return i === item;
    });
    if(find){
      this.deselectItem(item);
    }else{
      this.selectedItems.push(item);
    }
    console.log(this.selectedItems);
  }

  isSelected(item): boolean{
  const r = this.selectedItems.find(i =>{
    return i === item;
  });

  return (r) ? true : false;
}

private deselectItem(item:{}){
  let i = this.selectedItems.findIndex(i=>{
    return i === item;
  });
  if(i>=0){
    this.selectedItems.splice(i,1);
  }
}

deleteItems(){
  while(this.selectedItems.length>0){
    const elem = this.selectedItems.shift();
    const index = this.items.findIndex(i => {
      return i.text === elem.text;
    });
    this.items.splice(index, 1);
  }
}

}
