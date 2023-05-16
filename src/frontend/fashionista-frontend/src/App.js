import './App.css';
// import { BrowserRouter as Router, Routes, Route } from "npm i react-router-dom"
import NavBarTop from './components/NavBarTop'
import ListAllClothing from './components/clothes/ListAllClothingComponent';
// import HomepageComponent from './components/HomePageComponent';


function App() {
  return (
    <div>
      <NavBarTop/>
      {/* the list all clothing works but the table steches to much */}
      {/* <ListAllClothing/>  */}
    </div>
  );
}

export default App;
