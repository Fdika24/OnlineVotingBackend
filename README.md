# Online Voting System
An online voting system made with kotlin and springBoot

# Auth

# Get User Data
- EndPoint  : 
  ```api/getUserData/{uid}```
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
 - Request 
- EndPoint : ```api/getCandidates```
   
- Response
   - Header    :
   - Body      :
``` 
{
  "status" : "example : 404, type : Integer",
  "message" : "example : ok, type : string",
  "currPage" : "example : 1, type : Integer",
  "lastPage" : "example : 1, type : Integer",
  "data" : [
        {
          "name"    : "example : Joshua, type: String "
          "party"   : "example : PDIJ, type : String "
          "photo"   : "example : www.google.com/phoho.jpeg , type : String"
          "voters"  : "example : 69, type : Integer"
        },
      ]
  }
```

# Get Candidated Detail

# UpdateVote