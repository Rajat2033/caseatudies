import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Flights } from '../model/Flights';

@Injectable({
  providedIn: 'root'
})
export class FlightsService {

  constructor(private http:HttpClient){}
ROOT_URL:string="http://localhost:6794/api/v1/flights"

addNewFlights(flights:Flights):Observable<Flights>
{
return this.http.post<Flights>(this.ROOT_URL+"/add/newflights",flights);
}

updateFlights(flights:Flights,flightNumber:number):Observable<Flights>
{
  return this.http.put<Flights>(this.ROOT_URL+`/update/flights/${flightNumber}`,flights);
}

deleteFlights(flightNumber:number):Observable<String>
{
  return this.http.delete<string>(this.ROOT_URL+`/delete/flights/${flightNumber}`);
}

getFlightById(flightNumber:number):Observable<Flights>
{
  return this.http.get<Flights>(this.ROOT_URL+`/get/flight/${flightNumber}`);
}

getFlightByNumber(flightNumber:number):Observable<Flights[]>
{
  return this.http.get<Flights[]>(this.ROOT_URL+`/get/flight/${flightNumber}`);
}

getAllFlights():Observable<Flights[]>
{
  return this.http.get<Flights[]>(this.ROOT_URL+"/getall/flights");
}

}
