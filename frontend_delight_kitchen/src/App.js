import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './css/SideBar.css';
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css'
import Home from './pages/Home';
import Login from './pages/Login';
<<<<<<< HEAD
import User from './pages/User';
=======
import Logout from './pages/Logout';

>>>>>>> 4eff32b9b7d4babdf0eae188115e3fc5773f7ff0


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
<<<<<<< HEAD
  return loginStatus == '1' ? <Home /> : <Home/>
}

const AuthorizeUsers = () => {
  const loginStatus = sessionStorage['loginStatus']
  return loginStatus == '1' ? ((sessionStorage['role']=='manager')?<User />:<Home/> ) : <Login />
=======
  return loginStatus == '1' ? <Home /> : <Home />

>>>>>>> 4eff32b9b7d4babdf0eae188115e3fc5773f7ff0
}
const AuthorizeLogout = () => {
  const loginStatus = sessionStorage['loginStatus']
  return loginStatus == '1' ? <Logout /> : <Login />
}


function App() {
  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<AuthorizeUser />} />
          <Route path="/login" element={<AuthorizeLogin />} />
          <Route path="/home" element={<AuthorizeHome />}/>
<<<<<<< HEAD
          <Route path="/users" element={<AuthorizeUsers />} />

=======
          <Route path="/logout" element={<AuthorizeLogout />} />
>>>>>>> 4eff32b9b7d4babdf0eae188115e3fc5773f7ff0
        </Routes>
      </BrowserRouter>
      <ToastContainer theme="colored" />
    </div>
  );
}

export default App;
