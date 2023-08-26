import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './css/SideBar.css';
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css'
import Login from './pages/Login';
import Home from './pages/Home';
import User from './pages/User';
import Bill from './pages/Bill';
import Category from './pages/Category';
import Setting from './pages/Setting';
import Logout from './pages/Logout';
import Product from './pages/Product';

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
  return loginStatus == '1' ? <Home /> : <Login/>
}

const AuthorizeUsers = () => {
  const loginStatus = sessionStorage['loginStatus']
  return loginStatus == '1' ? ((sessionStorage['role']=='manager')?<User />:<Home/> ) : <Login />
}

const AuthorizeBill = () => {
  const loginStatus = sessionStorage['loginStatus']
  return loginStatus == '1' ? ((sessionStorage['role']=='manager'||sessionStorage['role']=='cashier')?<Bill />:<Home/> ) : <Login />
}


const AuthorizeCategory = () => {
  const loginStatus = sessionStorage['loginStatus']
  return loginStatus == '1' ? ((sessionStorage['role']=='manager'||sessionStorage['role']=='chef')?<Category />:<Home/> ): <Login />
}
const AuthorizeSetting = () => {
  const loginStatus = sessionStorage['loginStatus']
  return loginStatus == '1' ? <Setting /> : <Login />
}

const AuthorizeLogout = () => {
  const loginStatus = sessionStorage['loginStatus']
  return loginStatus == '1' ? < Login/> : <Logout/>
}
const AuthorizeProduct = () => {
  const loginStatus = sessionStorage['loginStatus']
  return loginStatus == '1' ? ((sessionStorage['role']=='manager'||sessionStorage['role']=='chef')?<Product />:<Home/> ) : <Login />
}

function App() {
  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<AuthorizeUser />} />
          <Route path="/login" element={<AuthorizeLogin />} />
          <Route path="/home" element={<AuthorizeHome />}/>
          <Route path="/users" element={<AuthorizeUsers />} />
          <Route path="/bill" element={<AuthorizeBill />} />
          <Route path="/category" element={<AuthorizeCategory />} />
          <Route path="/setting" element={<AuthorizeSetting/>} />
          <Route path="/logout" element={<AuthorizeLogout />} />
          <Route path="/product" element={<AuthorizeProduct />} />
       
        </Routes>
      </BrowserRouter>
      <ToastContainer theme="colored" />
    </div>
  );
}

export default App;
