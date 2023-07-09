package lotto.domain

@JvmInline
value class Lottos(val lottos: List<LottoNumbers>) {
    val size: Int
        get() = lottos.size

    operator fun plus(other: Lottos): Lottos {
        return Lottos(lottos + other.lottos)
    }

    fun match(winningLotto: WinningLotto): WinningStatistics {
        return lottos.map { lotto -> winningLotto.rank(lotto) }
            .groupingBy { it }
            .eachCount()
            .let { WinningStatistics(it) }
    }
}
