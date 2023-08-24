import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './css/SideBar.css';
//import './App.css';
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css'
import Home from './pages/Home';
import Login from './pages/Login';



const AuthorizeUser = () => {
  const loginStatus = sessionStorage['loginStatus']
  return loginStatus == '1' ? <Home /> : <Login />
}

const AuthorizeLogin = () => {
  const loginStatus = sessionStorage['loginStatus']
  return loginStatus == '1' ? <Home /> : <Login />
}

const AuthorizeHome = () => {
  const loginStatus = sessionStorage['loginStatus']
  return loginStatus == '1' ? <Home /> : <Login />
}

function App() {
  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<AuthorizeUser />} />
          <Route path="/login" element={<AuthorizeLogin />} />
          <Route path="/home" element={<AuthorizeHome />}/>

        </Routes>
      </BrowserRouter>
      <ToastContainer theme="colored" />
    </div>
  );
}

export default App;
