 // eslint-disable-next-line 
 /* eslint-disable */
 import './App.css'
 import React, { useState } from 'react'
 import { Cinema } from './components/cinema';
 
 const movies = [
   {
     name: 'Avenger',
     price: 10,
     occupied: [20, 21, 30, 1, 2, 8],
   },
   {
     name: 'Joker',
     price: 12,
     occupied: [9, 41, 35, 11, 65, 26],
   },
   {
     name: 'Toy story',
     price: 8,
     occupied: [37, 25, 44, 13, 2, 3],
   },
   {
     name: 'the lion king',
     price: 9,
     occupied: [10, 12, 50, 33, 28, 47],
   },
 ]
 
 
 export default function App() {
 
   return (
     <div className="App">
       <ShowCase />
       <Cinema />
 
       <p className="info">
         You have selected <span className="count">{10}</span>{' '}
         seats for the price of{' '}
       </p>
     </div>
   )
 }
 
 function ShowCase() {
   return (
     <ul className="ShowCase">
       <li>
         <span className="seat" /> <small>N/A</small>
       </li>
       <li>
         <span className="seat selected" /> <small>Selected</small>
       </li>
       <li>
         <span className="seat occupied" /> <small>Occupied</small>
       </li>
     </ul>
   )
 }
 
 
 