import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import ChampionList from './ChampionList';
import ChampionDetail from './ChampionDetail';

function App() {
  return (
    <Router>
      <div>
        <Routes>
          <Route path="/" element={<ChampionList />} />
          <Route path="/champions/:id" element={<ChampionDetail />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
