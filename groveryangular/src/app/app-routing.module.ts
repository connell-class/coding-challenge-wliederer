import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GrocerylistComponent } from './grocerylist/grocerylist.component';



const routes: Routes = [
  { path: 'grocerylist', component: GrocerylistComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [ GrocerylistComponent ]
