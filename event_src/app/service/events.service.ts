import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Events } from '../model/Events';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EventsService {

  
  ROOT_URL: string = "http://localhost:6794/api/v1/events";

  constructor(private http: HttpClient) {

  }

  createNewEvents(events: Events): Observable<Events> {
    return this.http.post<Events>(this.ROOT_URL + "/create/newevents", events);
  }

  getAllEvents():Observable<Events[]>
  {
    return this.http.get<Events[]>(this.ROOT_URL+"/getall/events");
  }

  getEventByid(eventId:number):Observable<Events>
  {
    return this.http.get<Events>(this.ROOT_URL+`/geteventbyid/${eventId}`)
  }
  

  updateEvent(events:Events,eventId:number):Observable<Events>
  {
    return this.http.put<Events>(this.ROOT_URL+`/update/event/${eventId}`,events);
  }

  deleteEventById(eventId:number):Observable<string>
  {
   return this.http.delete<string>(this.ROOT_URL+`/deleteevent/${eventId}`);
  }
}
