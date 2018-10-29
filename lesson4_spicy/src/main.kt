
fun main (args: Array<String>) {
    val spices1 = mutableListOf(
            Spice("curry", "mild"),
            Spice("pepper", "medium"),
            Spice("cayenne", "spicy"),
            Spice("ginger", "mild"),
            Spice("red curry", "medium"),
            Spice("green curry", "mild"),
            Spice("hot pepper", "extremely spicy")
    )

    val spice = Spice("wasabi", spiciness = "medium")
    spices1.add(spice)
    val spicelist = spices1.filter {it.heat < 5}
    spicelist.forEach{ println(it.name +" is "+ it.spiciness)}
}

fun makeSalt() = Spice("Salt")
