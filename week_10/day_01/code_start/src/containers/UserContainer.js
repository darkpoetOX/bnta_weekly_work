import React from "react";
import UserList from "../components/UserList";
import Register from "../components/Register";

const UserContainer = () => {
  const [users, setUsers] = React.useState([]);
  // if useState input is an array like the above, because of how the virtual DOM works, it won't see a changed state for arrays BECAUE ARRAYS ARE REFERENCE TYPES AND DO NOT TRIGGER A CHANGE IN MEMORY JUST BY CHANGING THE ARRAY CONTENT.
  // CLONING A REFERENCE RESULTS IN THE CLONE BEING GIVEN A NEW REFERENCE LOCATION IN MEMORY

  const addNewUser = (newUser) => {
    const updatedUsers = [...users, newUser]
    setUsers(updatedUsers)
  }
  

  return (
    <>
      <UserList users={users} />
      <Register users={users} addNewUser={addNewUser} />
    </>
  );
};

export default UserContainer;
