import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Flights } from 'src/app/model/Flights';
import { FlightsService } from 'src/app/service/flights.service';

@Component({
  selector: 'app-updateflight',
  templateUrl: './updateflight.component.html',
  styleUrls: ['./updateflight.component.css']
})
export class UpdateflightComponent implements OnInit{
flightNumber!:any;
flights!:Flights;
flight!:Flights;
searchInput!:any;
  constructor(private flightService:FlightsService,private route:ActivatedRoute){}
  ngOnInit(): void {
    this.route.params.subscribe(params=>
      {
        this.flightNumber=params['flightNumber'];
        console.log(this.flightNumber);
      })
    this.flightService.getFlightById(this.flightNumber).subscribe((data:Flights)=>
      {
        console.log(data);
        this.flights=data;
        console.log(this.flights);

      })
   
  }

  updateFlight(formData:any)
  {
    this.flightService.updateFlights(formData.form.value,this.flightNumber).subscribe(updateddata=>
      {
        alert("Data Got Updated Successfully");
      })
  }

  searchResult()
  {
    console.log(this.searchInput);
    this.flightService.getFlightById(this.searchInput).subscribe((data)=>
      {
        this.flight=data;
      })
  }
}
