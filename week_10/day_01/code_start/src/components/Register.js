import { useState } from "react";

// This is controlled form
const Register = ({ users, addNewUser }) => {
  
  const [username, setUsername] = useState(""); 
  // useState is an empty string to begin, waiting for username input
  const [email, setEmail] = useState(""); 
  const [password, setPassword] = useState(""); 
  const [confirmPassword, setConfirmPassword] = useState("");
  const [error, setError] = useState("");

  const handleValidation = () => {
    let failedValidation = false;

    if(users.some((user) => username.username === username || user.email === email)){
      failedValidation = true;
      setError("User already exists")
    }

    if(password !== confirmPassword){
      failedValidation = true;
      setError("Passwords don't match")
    }
    
    if(username === "" || email === "" || password === ""){
      failedValidation = true;
      setError("Please don't leave fields empty")
    }
    
    return failedValidation;
  }
  //  note: only event handlers need an input i.e.'e' in the input so we don't need one above
  // the some() method in the if statement finds the first a match to the argument passed to it and returns true

  const handleSubmit = (e) => {
    e.preventDefault();
    //  handle the validation and create a new user
    if(!handleValidation()){
      const newUser = {
        username: username,
        email: email,
        password: password,
      };
      addNewUser(newUser);
      setUsername("");
      // above line resets input field to empty
      setEmail("");
      setPassword("");
      setConfirmPassword("");
    }
    
    //  send up new user to the container
  }

  return(
  
    <>
      <h2>Sign Up</h2>

      <form onSubmit={handleSubmit}>
        <input 
          type="text"
          // above is the type of input field you're putting in
          name="username"
          placeholder="Username"
          value={username}
          onChange={ (e) => setUsername(e.target.value) }
          // e above means 'event'; the onChange is there for live text to be seen i.e. onChange triggers on every key stroke
        />
        <input 
          type="email"
          // type is "email" because there is actually an email type
          name="email"
          placeholder="Email"
          value={email}
          onChange={ (e) => setEmail(e.target.value) }
        />
        <input 
          type="password"
          // the type "password" means the user sees black dots so as not to reveal password on screem
          name="password"
          placeholder="Password"
          value={password}
          onChange={ (e) => setPassword(e.target.value) }
        />
        <input 
          type="password"
          // note that type is also "password"
          name="confirmPassword"
          placeholder="Confirm your Password"
          value={confirmPassword}
          onChange={ (e) => setConfirmPassword(e.target.value) }
        />
        <input 
          type="submit"
          value="Register"
        />
      </form>
    </>
  )
};

export default Register;
