abstract class Dwelling(var resident: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int

    fun hasRoom(): Boolean{
        return resident < capacity
    }
}