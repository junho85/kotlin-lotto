package lotto.domain

class Lotto(val numbers: Set<Int>) {
    init {
        require(numbers.size == 6) { "로또 번호는 6개여야 합니다." }
        require(numbers.all { it in 1..45 }) { "로또 번호는 1부터 45 사이여야 합니다." }
    }

    constructor(numbers: List<Int>) : this(numbers.toSet())

    override fun toString(): String {
        return numbers.joinToString(
            prefix = "[",
            postfix = "]",
            separator = ", ",
        )
    }
}
