import './App.css';
import { OrderView } from './views/orderView';
import { SiteUserView } from './views/SiteUserView';
import { BrowserRouter, Route, Routes } from 'react-router-dom';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="orders" element={<OrderView />} />
        <Route path="siteUsers" element={<SiteUserView />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
