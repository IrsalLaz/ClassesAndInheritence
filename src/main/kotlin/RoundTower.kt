class RoundTower(residents: Int,
    floors: Int) : RoundHut(residents) {
    override val capacity = 4 * floors
    override val buildingMaterial = "Stone"
}