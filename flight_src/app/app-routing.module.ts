import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FlightsComponent } from './components/flights/flights.component';
import { UpdateflightComponent } from './components/updateflight/updateflight.component';

const routes: Routes = [
  {path:'',component:FlightsComponent},
  {
    path:'update/:flightNumber',component:UpdateflightComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
