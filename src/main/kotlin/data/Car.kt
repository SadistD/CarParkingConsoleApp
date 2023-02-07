package data

data class Car(
    val brand: String,
    val color: String,
    val registrationNumber: String,
    val owner: Owner
) {
    override fun toString(): String {
        return "$brand, $color, $registrationNumber"
    }
}
