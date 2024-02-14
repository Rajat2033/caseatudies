import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Events } from 'src/app/model/Events';
import { EventsService } from 'src/app/service/events.service';

@Component({
  selector: 'app-updateevents',
  templateUrl: './updateevents.component.html',
  styleUrls: ['./updateevents.component.css']
})
export class UpdateeventsComponent implements OnInit{
  events!:Events;
  eventId!:any;
  constructor(private route:ActivatedRoute,private eventService:EventsService)
  {
   
  }
  ngOnInit(): void {
    this.route.params.subscribe(params => {
      console.log(params); // Check if 'eventId' is present in the params object
      this.eventId = params['eventId'];
      // sessionStorage.setItem('id', eventId);
    
      console.log(this.eventId);
      this.eventService.getEventByid(this.eventId).subscribe((data) => {
        this.events = data;
      });
    });
  }
  
  updateEvents(formData: any) {
   
    console.log(this.eventId);
    this.eventService.updateEvent(formData.form.value, this.eventId).subscribe((updateddata) => {
      alert("Data Updated Successfully");
    });
  }
  

}
