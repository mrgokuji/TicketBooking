/* eslint-disable */ 
import './App.css'
import React, { useState } from 'react'
import clsx from 'clsx'
import {Cinema} from './components/cinema';

export default function App() {
  return (
    <div className="App">
      <ShowCase />
      <Cinema />
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

