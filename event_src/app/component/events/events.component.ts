import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Events } from 'src/app/model/Events';
import { EventsService } from 'src/app/service/events.service';

@Component({
  selector: 'app-events',
  templateUrl: './events.component.html',
  styleUrls: ['./events.component.css']
})
export class EventsComponent implements OnInit {
  eventsList:Events[]=[];
  eventId!:number;
  event!:Events
  searchInput:any;
  constructor(private eventService:EventsService,private route:ActivatedRoute,private router:Router){
   
  }
  ngOnInit(): void {

    this.eventService.getAllEvents().subscribe((details)=>
    {
      this.eventsList=details;
      console.log(this.eventsList);
      console.log("Data Fetched");
    })
  }

 
  createNewEvents(formData:any)
  {
    this.eventService.createNewEvents(formData.form.value).subscribe((data)=>
    {
      formData.reset();
      alert("Data Entered Successfully");
      console.log(data);
    })
  }

 deleteevent(eventId:number)
 {
  this.eventService.deleteEventById(eventId).subscribe(deleteddetails=>
  {
    alert("Data with id "+eventId+" got deleted")
  })
 }

 gototheupdateform(eventId:number)
 {
  
  this.router.navigate(['/updateform/'+eventId])
 }

 searchResult()
 {
  this.eventService.getEventByid(this.searchInput).subscribe(data=>
    {

     this.event=data;
      console.log(data);
      console.log(this.event)
      
    })
 }

}
