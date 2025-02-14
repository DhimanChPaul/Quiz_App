package com.example.quiz

//import android.os.Parcel
//import android.os.Parcelable

//data class QuizModel(val qustion:String,val option1:String,val option2:String,val option3:String,val option4:String,val ans:String){
//
//}



//data class QuizModel{
//
//    var qustion:String?= null
//    var option1:String?= null
//    var option2:String?= null
//    var option3:String?= null
//    var option4:String?= null
//    var ans:String?= null
//
//    constructor()
//    constructor(
//        qustion:String?,
//        option1:String?,
//        option2:String?,
//        option3:String?,
//        option4:String?,
//        ans:String?
//    ){
//        this.qustion=qustion
//        this.ans=ans
//        this.option1=option1
//        this.option2=option2
//        this.option3=option3
//        this.option4=option4
//
//    }
//    constructor(qustion:String,option1:String,option2:String,option3:String,option4:String, ans:String){
//
//    }
//
//
//
//}



//data class QuizModel(val qustion:String,val option1:String,val option2:String,val option3:String,val option4:String,val ans:String) :
//    Parcelable {
//
//    constructor(parcel: Parcel) : this(
//        parcel.readString().toString(),
//        parcel.readString().toString(),
//        parcel.readString().toString(),
//        parcel.readString().toString(),
//        parcel.readString().toString(),
//        parcel.readString().toString()
//    ) {
//    }
//
//
//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeString(qustion)
//        parcel.writeString(option1)
//        parcel.writeString(option2)
//        parcel.writeString(option3)
//        parcel.writeString(option4)
//        parcel.writeString(ans)
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<QuizModel> {
//        override fun createFromParcel(parcel: Parcel): QuizModel {
//            return QuizModel(parcel)
//        }
//
//        override fun newArray(size: Int): Array<QuizModel?> {
//            return arrayOfNulls(size)
//        }
//    }
//}



//data class QuizModel(val qustion:String,val option1:String,val option2:String,val option3:String,val option4:String,val ans:String){
//
//}



//data class QuizModel(
//    val qustion: String,
//    val option1: String = "",
//    val option2: String = "",
//    val option3: String = "",
//    val option4: String = "",
//    val ans: String
//) {
//    constructor(qustion: String, options: List<String>, ans: String) : this(
//        qustion,
//        options.getOrElse(0) { "" }, // Use getOrElse to avoid IndexOutOfBoundsException
//        options.getOrElse(1) { "" },
//        options.getOrElse(2) { "" },
//        options.getOrElse(3) { "" },
//        ans
//    )
//}


//data class QuizModel(val qustion: String, val option1: String, val option2: String, val option3: String, val option4: String, val ans: String) {
//    constructor(qustion: String, options: List<String>, ans: String) : this(
//        qustion,
//        options[0],
//        options[1],
//        options[2],
//        options[3],
//        ans
//    )
//}



data class QuizModel(
    val qustion: String = "",
    val option1: String = "",
    val option2: String = "",
    val option3: String = "",
    val option4: String = "",
    val ans: String = ""
)
