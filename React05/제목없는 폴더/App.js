import Champ from './Champ';
import ChampDetail from './ChampDetail';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

function App() {
  return (
    <Router>
      <div>
        <Routes>
          <Route exact path='/' Component={Champ}/>
          <Route path='/champions/:id' Component={ChampDetail}/>
        </Routes>
      </div>
    </Router>
  );
}

export default App;
