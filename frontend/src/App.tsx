import React from 'react';
import logo from './logo.svg';
import './App.css';
import { OrderController } from './controller/orderController';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.tsx</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <button onClick={() => OrderController.createOrder({
          siteUserId: 5
        })}>
          Press me!
        </button>
      </header>
    </div>
  );
}

export default App;
