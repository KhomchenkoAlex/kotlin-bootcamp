fun main(args: Array<String>) {
    println("What is you mood today?")
    val mood = readLine()
    println ("What is the weather today?")
    val weather = readLine()
    println("What is the temperature today?")
    val temperature = readLine()?.toInt()
    println(whatShouldIDoToday(mood!!, weather!!, temperature!!))
}

fun isVeryHot (temperature: Int) = temperature > 35
fun isSadRainyCold (mood: String, weather: String, temperature: Int) =
        mood == "sad" && weather == "rainy" && temperature == 0
fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
    return when {
        isVeryHot(temperature) -> "go swimming"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isHappySunny(mood, weather) -> "go for a walk"
        else -> "Stay home and read."
    }
}