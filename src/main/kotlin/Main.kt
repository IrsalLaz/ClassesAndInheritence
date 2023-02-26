fun main() {
    val squareCabin = SquareCabin(3)
    val roundHut = RoundHut(4)
    val roundTower = RoundTower(3, 2)

    //best practice way to print, to avoid repetitive code
    with(squareCabin){
        println("\nSquare Cabin\n==========")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has Room? ${hasRoom()}")
    }

    with(roundHut){
        println("\nRound Hut\n==========")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has Room? ${hasRoom()}")
    }

    with(roundTower){
        println("\nRound Tower\n==========")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has Room? ${hasRoom()}")
    }
}