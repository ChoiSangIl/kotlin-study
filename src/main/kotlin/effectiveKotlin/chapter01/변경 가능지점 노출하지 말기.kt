package effectiveKotlin.chapter01


class UserRepository {
    //private val storedUsers: MuatableMap<Int, String> = mutableMapOf() 이거 오류 나는데...
    private val storedUsers = mutableMapOf<Int, String>()


    fun loadAll(): MutableMap<Int,String> {
        return storedUsers
    }
}


fun main() {
    // loadAll을 사용해서 private
    val userRepository = UserRepository()

    val storedUsers = userRepository.loadAll()
    storedUsers[4] = "AAA"
    //...

    print(userRepository.loadAll()) // {4=AAA}
}