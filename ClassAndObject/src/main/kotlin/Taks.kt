fun main (){
    val firstName1 = "Andi"
    val lastName1 = "Budiman"
    val age1 = 34

    val firstName2 = "Rudi"
    val lastName2 = "Setiawan"
    val age2 = 25

    val firstName = arrayListOf<String>()
    val lastName = arrayListOf<String>()
    val age = arrayListOf<Int>()

    firstName.add("Andi")
    lastName.add("Budiman")
    age.add(34)

    firstName.add("Rudi")
    lastName.add("Setiawan")
    age.add(25)


    val andiArray = arrayListOf<Any>()
    andiArray.add("Andi")
    andiArray.add("Budiman")
    andiArray.add("34")
    for (andi in andiArray){
        println(andi)
    }

    val mhsArray = arrayListOf<ArrayList<Any>>()
    mhsArray.add(andiArray)
    mhsArray.add(arrayListOf("Rudi","Setiawan", 25))
    for (item in mhsArray){
        for (i in item){
            println(i)
        }
    }

    // data class
    val andi = User ("Andi", "Budiman", 34)
    val rudi = User ("Rudi", "setiawan", 25)
    val dedi = User ()
    dedi.age = 35
    dedi.firstName = "Dedi"
    

}