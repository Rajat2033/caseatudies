import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EventsComponent } from './component/events/events.component';
import { UpdateeventsComponent } from './component/updateevents/updateevents.component';

const routes: Routes = [
  {path:'' ,component:EventsComponent},
  {path:'updateform/:eventId',component:UpdateeventsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
