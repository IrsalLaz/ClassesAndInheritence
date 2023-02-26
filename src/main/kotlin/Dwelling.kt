abstract class Dwelling(var residents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int

    fun hasRoom(): Boolean{
        return residents < capacity
    }
}