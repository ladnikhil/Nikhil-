import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { NgForm } from '@angular/forms';


@Component({
  selector: 'app-firebase',
  templateUrl: './firebase.component.html',
  styleUrls: ['./firebase.component.css']
})
export class FirebaseComponent implements OnInit {

  constructor(private firebaseService: FirebaseService) { }

  postuser(form: NgForm){
    this.firebaseService.postData(form.value).subscribe(data =>{
      console.log(data);
      form.reset(); /// to reset
    },err =>{
      console.log(err);
    })
  }

  ngOnInit() {
  }

}
