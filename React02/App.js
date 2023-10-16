import './App.css';
import Login from './Login'
import List from './List'
import Lotto from './Lotto'
import Context from './Context'
import Language from './Language'

function App() {
  return (
    <div>
      <h1>로그인 관련 처리</h1>
      <Login/>
      <h1>리스트 여러개 만들기</h1>
      <List/>
      <h1>로또 출력하기</h1>
      <Lotto/>
      <h1>콘텍스트 사용해보기</h1>
      <Context/>
      <h1>콘텍스트로 언어 전달</h1>
      <Language/>
    </div>
  );
}

export default App;
