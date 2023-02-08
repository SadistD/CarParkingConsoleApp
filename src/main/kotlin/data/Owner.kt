package data

data class Owner(
    val firstName: String,
    val lastName: String,
) {
    override fun toString(): String {
        return "$firstName $lastName"
    }
}
