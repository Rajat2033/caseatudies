import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Flights } from 'src/app/model/Flights';
import { FlightsService } from 'src/app/service/flights.service';

@Component({
  selector: 'app-flights',
  templateUrl: './flights.component.html',
  styleUrls: ['./flights.component.css']
})
export class FlightsComponent implements OnInit{
flights:Flights[]=[];
  constructor(private flightService:FlightsService,private  router:Router){}
  ngOnInit(): void {
    this.flightService.getAllFlights().subscribe(data=>
      {
        this.flights=data;
        console.log("Data Fetched");

      })
  }

  addFlight(formData:any)
  {

    this.flightService.addNewFlights(formData.form.value).subscribe(data=>
      {
        alert("Data Entered Successfully");
        formData.reset();
      })
  }

  updateFlight(flightNumber:number)
  {
    this.router.navigate(['/update/'+flightNumber]);
  }
  deleteFlight(flightNumber:number)
  {
    this.flightService.deleteFlights(flightNumber).subscribe(data=>
      {
        alert("Flight with if "+flightNumber+" is deleted");
      })
  }
}
