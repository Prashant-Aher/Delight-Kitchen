import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router';
import { toast } from 'react-toastify';
import { URL } from '../config';
import '../css/Login.css'



const Login = () => {

const[email,setEmail]=useState("");
const[password,setPassword]=useState("");

const navigate = useNavigate()  // Navigation function from React Router


const LoginFunction=()=>
{
    if (email.length == 0) {
      toast.warning('please enter email')
    } 
    else  if(!email.includes("@"))
    {
      toast.warning('please enter correct email')
    }
    else if (password.length == 0) {
      toast.warning('please enter password')
    } 
    else {

     
        const body = {
          email,
          password,
        }
         axios.post(`${URL}/users/login`,body).then((response)=>
         {
          const result = response.data
          if (result['status'] == 'success') {
            toast.success('Welcome to the application')
            const { userId, name, email,phone,role } = result['data']
            sessionStorage['userId'] = userId
            sessionStorage['name'] = name
            sessionStorage['email'] = email
            sessionStorage['phone'] = phone
            sessionStorage['role'] = role
            sessionStorage['loginStatus'] = 1
            navigate('/home')
          }
          else
          {
           
            toast.error(result['error'])
          }
         })
        
      }
     
}


  return (
   
<div className='container' id='maincontainer'>

    <div className="row">
        <div className="col" id='divlogin'>
        <div className="col" id='divheading'>
        <span className='text-secondary'>Delight Kitchen</span>
        </div>
        <hr/>
        <div >
    <h2>Log In</h2>
    <form > 

    <div className="form-outline mb-4">
    <label  className="form-label" htmlFor="typeEmailX-2">Email</label>
                <input onChange={(e)=>{setEmail(e.target.value)}} type="email"  className="form-control form-control-lg" placeholder='abc@gmail.com'  />
                
                </div>

                <div className="form-outline mb-4">
                <label className="form-label" htmlFor="typePasswordX-2">Password</label>
                <input onChange={(e)=>{setPassword(e.target.value)}} type="password"  className="form-control form-control-lg" placeholder='**********'  />
                
                </div>        
    </form>
    <button  onClick={LoginFunction} className="btn btn-primary btn-lg btn-block" >Login</button>
    </div>
        </div>
        <div className="col" id='divimage'>
  
        </div>
    </div>
</div>

   
  )
}

export default Login