package com.example.u_farm.model

data class U_Farm(
    var uid:String="",
    var username:String="#Username",
    var email:String="",
    var password:String="",
    var phonenumber:String="",
    var profilePicture:String="",
    var job:String="#Farmer",
    var location:String="",
    var language:String="English",
    var verificationDocs:String="",
)

data class Problem(
    var problemUid:String="",
    var userUid:String="",
    var username:String="",
    var profilePicture:String="",
    var problemStatement:String="",
    var DiseaseAffectedPlantImage:String="",
    var voiceOverOfText:String="",

)

data class Solution(
    var solutionUid:String="",
    var problemUid:String="",
    var userUid:String="",
    var username:String="",
    var profilePicture:String="",
    var solutionStatement:String="",
    var voiceOverOfText:String="",
    )

data class Image(
    var image:String="",
)
