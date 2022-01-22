# Online Voting System
An online voting system made with kotlin and springBoot

# Auth

# Get User Data
- Request
    - Body      :
  ```
  {
  "userID" : "example : uID_44, type : String"
  }
  ```
- Response
    - Header    :
    - Body      :
  ```
  {
  "status" : "example : 404, type : Integer",
  "message" : "example : ok, type : string",
  "currPage" : "example : 1, type : Integer",
  "lastPage" : "example : 1, type : Integer",
  "data" : 
      {
        "id" : "example : uID_44, type : String",
        "name" : "example : Jhonson, type : String",
        "isVoted" : "example : true, type: Boolean"
      }
  }
  ```

# Get Candidates

# Get Candidated Detail

# GetVote

# PostVote