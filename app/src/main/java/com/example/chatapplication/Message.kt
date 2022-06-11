package com.example.chatapplication

class Message {
    var message: String?=null
    var senderid: String?= null

    constructor(){}

    constructor(message: String?, senderId: String?){
        this.message= message
        this.senderid= senderid
    }

}