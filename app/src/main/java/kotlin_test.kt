class Dice (val sidesnumber: Int){
    var sides = sidesnumber

    fun spin() : Int{ (1..sides).random()
        return (1..sides).random()
    }
}


fun main(){
    val Diceone = Dice((100..1000).random())
    val Dicespin = Diceone.spin()
    println("${Diceone.sides} 면의 주사위를 굴린값은 ${Dicespin}")
}
